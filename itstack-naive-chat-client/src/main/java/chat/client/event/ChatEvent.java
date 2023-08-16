package src.main.java.chat.client.event;

import chat.protocol.friend.AddFriendRequest;
import chat.protocol.friend.SearchFriendRequest;
import chat.protocol.msg.MsgGroupRequest;
import chat.protocol.msg.MsgRequest;
import chat.protocol.talk.DelTalkRequest;
import chat.protocol.talk.TalkNoticeRequest;
import io.netty.channel.Channel;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import org.itstack.naive.chat.ui.view.chat.IChatEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import src.main.java.chat.client.infrastructure.util.BeanUtil;

import java.util.Date;

/**
 * @author yangmingjun
 * @data 2023/8/16 23:11
 */
public class ChatEvent implements IChatEvent {
    private Logger logger = LoggerFactory.getLogger(ChatEvent.class);
    @Override
    public void doQuit() {
        logger.info("退出登陆！");
        BeanUtil.getBean("channel", Channel.class).close();
    }

    @Override
    public void doSendMsg(String userId, String talkId, Integer talkType, String msg, Integer msgType, Date msgDate) {
        Channel channel = BeanUtil.getBean("channel", Channel.class);
        // 好友0
        if (0 == talkType) {
           // channel.writeAndFlush(new MsgRequest(userId, talkId, msg, msgType, msgDate));
        }
        // 群组1
        else if (1 == talkType) {
          //  channel.writeAndFlush(new MsgGroupRequest(talkId, userId, msg, msgType, msgDate));
        }
    }

    @Override
    public void doEventAddTalkUser(String userId, String userFriendId) {
        Channel channel = BeanUtil.getBean("channel", Channel.class);
        //channel.writeAndFlush(new TalkNoticeRequest(userId, userFriendId, 0));
    }

    @Override
    public void doEventAddTalkGroup(String userId, String groupId) {
        Channel channel = BeanUtil.getBean("channel", Channel.class);
        //channel.writeAndFlush(new TalkNoticeRequest(userId, groupId, 1));
    }

    @Override
    public void doEventDelTalkUser(String userId, String talkId) {
        Channel channel = BeanUtil.getBean("channel", Channel.class);
        //channel.writeAndFlush(new DelTalkRequest(userId, talkId));
    }

    @Override
    public void addFriendLuck(String userId, ListView<Pane> listView) {
        Channel channel = BeanUtil.getBean("channel", Channel.class);
        channel.writeAndFlush(new SearchFriendRequest(userId, ""));
    }

    @Override
    public void doFriendLuckSearch(String userId, String text) {
        Channel channel = BeanUtil.getBean("channel", Channel.class);
        channel.writeAndFlush(new SearchFriendRequest(userId, text));
    }

    @Override
    public void doEventAddLuckUser(String userId, String friendId) {
        Channel channel = BeanUtil.getBean("channel", Channel.class);
        channel.writeAndFlush(new AddFriendRequest(userId, friendId));
    }

}
