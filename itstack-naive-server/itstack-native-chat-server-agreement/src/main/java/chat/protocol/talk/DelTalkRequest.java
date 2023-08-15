package chat.protocol.talk;

import chat.protocol.Command;
import chat.protocol.Packet;
import lombok.Data;

import java.util.Date;

/**
 * 删除对话框请求
 * @author yangmingjun
 * @data 2023/8/15 23:50
 */
@Data
public class DelTalkRequest extends Packet {
    private String talkId;          // 对话框ID
    private String userId;          // 用户ID[自己/好友]
    private String userNickName;    // 用户昵称[群组聊天]
    private String userHead;        // 用户头像[群组聊天]
    private Integer msgUserType;    // 消息类型[0自己/1好友]
    private String msgContent;      // 消息内容
    private Integer msgType;        // 消息类型；0文字消息、1固定表情
    private Date msgDate;           // 消息时间

    @Override
    public Byte getCommand() {
        return Command.DelTalkRequest;
    }
}
