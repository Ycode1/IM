package chat.protocol.login;

import chat.protocol.Command;
import chat.protocol.Packet;
import chat.protocol.login.dto.ChatTalkDto;
import chat.protocol.login.dto.GroupsDto;
import chat.protocol.login.dto.UserFriendDto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangmingjun
 * @data 2023/8/15 0:33
 */
public class LoginResponse extends Packet {
    // 登陆反馈
    private boolean success;
    // 用户ID
    private String userId;
    // 用户头像
    private String userHead;
    // 用户昵称
    private String userNickName;
    // 聊天对话框数据[success is true]
    private List<ChatTalkDto> chatTalkList = new ArrayList<>();
    // 群组列表
    private List<GroupsDto> groupsList = new ArrayList<>();
    // 好友列表
    private List<UserFriendDto> userFriendList = new ArrayList<>();

    @Override
    public Byte getCommand() {
        return Command.LoginResponse;
    }
}
