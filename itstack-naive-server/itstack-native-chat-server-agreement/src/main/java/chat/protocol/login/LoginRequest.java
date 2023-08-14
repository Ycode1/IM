package chat.protocol.login;

import chat.protocol.Command;
import chat.protocol.Packet;

/**
 * @author yangmingjun
 * @data 2023/8/15 0:31
 */
public class LoginRequest extends Packet {

    private String userId;        // 用户ID
    private String userPassword;  // 用户密码

    public LoginRequest(String userId, String userPassword) {
        this.userId = userId;
        this.userPassword = userPassword;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    @Override
    public Byte getCommand() {
        return Command.LoginRequest;
    }
}
