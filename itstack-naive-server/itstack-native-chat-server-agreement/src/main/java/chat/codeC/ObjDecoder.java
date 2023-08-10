package chat.codeC;

import chat.util.SerializationUtil;
import com.sun.xml.internal.ws.api.message.Packet;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * @author yangmingjun
 * @data 2023/8/10 23:33
 */
public class ObjDecoder extends ByteToMessageDecoder {
    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf in, List<Object> list) throws Exception {
        if (in.readableBytes() < 4) {
            return;
        }
        in.markReaderIndex();
        int dataLength = in.readInt();
        if (in.readableBytes() < dataLength) {
            in.resetReaderIndex();
            return;
        }
        byte command = in.readByte();  //读取指令
        byte[] data = new byte[dataLength - 1]; //指令占了一位，剔除掉
        in.readBytes(data);
       // list.add(SerializationUtil.deserialize(data, Packet.get(command)));
    }
}
