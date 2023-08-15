package chat.protocol.msg;

import chat.protocol.Command;
import chat.protocol.Packet;
import lombok.Data;


import java.util.Date;

/**
 * 群组消息请求
 */
@Data
public class MsgGroupRequest extends Packet {

    private String talkId;   // 对话框ID
    private String userId;   // 群员ID
    private String msgText;  // 传输消息内容
    private Integer msgType;  // 消息类型；0文字消息、1固定表情
    private Date msgDate;    // 消息时间



    @Override
    public Byte getCommand() {
        return Command.MsgGroupRequest;
    }

}
