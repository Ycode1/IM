package chat.protocol.talk;

import chat.protocol.Command;
import chat.protocol.Packet;
import lombok.Data;

import java.util.Date;

/**
 * 对话通知应答
 * @author yangmingjun
 * @data 2023/8/15 23:53
 */
@Data
public class TalkNoticeResponse extends Packet {

    private String talkId;     // 对话框ID[好友ID、群ID]
    private String talkName;   // 对话框名称[好友名称、群名称]
    private String talkHead;   // 对话框头像[好友头像、群头像]
    private String talkSketch; // 消息简讯
    private Date talkDate;     // 消息时间
    @Override
    public Byte getCommand() {
        return Command.TalkNoticeResponse;
    }
}
