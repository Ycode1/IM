package chat.domain.inet.model;

import lombok.Data;

/**
 * @author yangmingjun
 * @data 2023/8/10 22:54
 */
@Data
public class ChannelUserInfo {
    /**
     * 用户id
     */
    private String userId;
    /**
     * 用户昵称
     */
    private String userNickName;
    /**
     * 用户头像
     */
    private String userHead;
    /**
     * 状态[true在线、false不在线]
     */
    private boolean status;
}
