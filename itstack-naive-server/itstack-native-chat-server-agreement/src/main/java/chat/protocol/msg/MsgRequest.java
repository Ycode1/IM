package chat.protocol.msg;

import chat.protocol.Command;
import chat.protocol.Packet;
import lombok.Data;

import java.util.Date;

/**
 *
 * @author asus
 */
@Data
public class MsgRequest extends Packet {

    private String userId;   // 用户ID[个人]
    private String friendId; // 好友ID[对方]
    private String msgText;  // 传输消息内容
    private Integer msgType; // 消息类型；0文字消息、1固定表情
    private Date msgDate;    // 消息时间



    @Override
    public Byte getCommand() {
        return Command.MsgRequest;
    }

}
