package chat.protocol.talk;

import chat.protocol.Command;
import chat.protocol.Packet;
import lombok.Data;

/**
 * 对话通知请求
 * @author yangmingjun
 * @data 2023/8/15 23:52
 */
@Data
public class TalkNoticeRequest extends Packet {

    private String userId;       // 用户ID
    private String friendUserId; // 好友ID
    private Integer talkType;    // 对话框类型[0好友、1群组]

    @Override
    public Byte getCommand() {
        return Command.TalkNoticeRequest;
    }
}
