package chat.codeC;
import chat.protocol.Packet;
import chat.util.SerializationUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * 解码器
 * @author yangmingjun
 * @data 2023/8/15 0:27
 */
public class ObjEncoder extends MessageToByteEncoder<Packet> {
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Packet in, ByteBuf out) throws Exception {
        byte[] data = SerializationUtil.serialize(in);
        out.writeInt(data.length + 1);
        out.writeByte(in.getCommand()); //添加指令
        out.writeBytes(data);
    }
}
