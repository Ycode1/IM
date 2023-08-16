package src.main.java.chat.client.event;

import chat.protocol.login.LoginRequest;
import io.netty.channel.Channel;
import org.itstack.naive.chat.ui.view.login.ILoginEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import src.main.java.chat.client.infrastructure.util.BeanUtil;
import src.main.java.chat.client.infrastructure.util.CacheUtil;

/**
 * @author yangmingjun
 * @data 2023/8/16 23:11
 */
public class LoginEvent implements ILoginEvent {

    private Logger logger = LoggerFactory.getLogger(LoginEvent.class);

    @Override
    public void doLoginCheck(String userId, String userPassword) {
        Channel channel = BeanUtil.getBean("channel", Channel.class);
        channel.writeAndFlush(new LoginRequest(userId, userPassword));
        CacheUtil.userId = userId;
    }
}
