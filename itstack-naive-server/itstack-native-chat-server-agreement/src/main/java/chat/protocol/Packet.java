package chat.protocol;

import chat.protocol.login.LoginRequest;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 协议包
 *
 * @autor yangmingjun
 * @data 2023/8/10 23:41
 */
public abstract class Packet {

    private final static Map<Byte, Class<? extends Packet>> packetType = new ConcurrentHashMap<>();

    static {
        packetType.put(Command.LoginRequest, LoginRequest.class);
//        packetType.put(Command.LoginResponse, LoginResponse.class);
//        packetType.put(Command.MsgRequest, MsgRequest.class);
//        packetType.put(Command.MsgResponse, MsgResponse.class);
//        packetType.put(Command.TalkNoticeRequest, TalkNoticeRequest.class);
//        packetType.put(Command.TalkNoticeResponse, TalkNoticeResponse.class);
//        packetType.put(Command.SearchFriendRequest, SearchFriendRequest.class);
//        packetType.put(Command.SearchFriendResponse, SearchFriendResponse.class);
//        packetType.put(Command.AddFriendRequest, AddFriendRequest.class);
//        packetType.put(Command.AddFriendResponse, AddFriendResponse.class);
//        packetType.put(Command.DelTalkRequest, DelTalkRequest.class);
//        packetType.put(Command.MsgGroupRequest, MsgGroupRequest.class);
//        packetType.put(Command.MsgGroupResponse, MsgGroupResponse.class);
//        packetType.put(Command.ReconnectRequest, ReconnectRequest.class);
    }

    public static Class<? extends Packet> get(Byte command) {
        return packetType.get(command);
    }


    /**
     * 获取协议指令
     *
     * @return 返回指令值
     */
    public abstract Byte getCommand();
}
