package chat.domain.inet.model;

import lombok.Data;

/**
 * @author yangmingjun
 * @data 2023/8/10 22:54
 */
@Data
public class ChannelUserInfo {
    private String userId;       //用户ID
    private String userNickName; //用户昵称
    private String userHead;     //用户头像
    private boolean status;      //状态[true在线、false不在线]
}
