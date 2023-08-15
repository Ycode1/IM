package chat.protocol.friend.dto;

import lombok.Data;

/**
 * @author asus
 */
@Data
public class UserDto {
    private String userId;       // 用户ID
    private String userNickName; // 用户昵称
    private String userHead;     // 用户头像
    private Integer status;      // 状态；0添加、1[保留]、2已添加
}
