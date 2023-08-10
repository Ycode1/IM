package chat.application;

import chat.domain.inet.model.ChannelUserInfo;
import chat.domain.inet.model.ChannelUserReq;
import chat.domain.inet.model.InetServerInfo;

import java.util.List;

/**
 * 网络信息查询
 * @author yangmingjun
 * @data 2023/8/10 22:53
 */
public interface InetService {
    InetServerInfo queryNettyServerInfo();

    Long queryChannelUserCount(ChannelUserReq req);

    List<ChannelUserInfo> queryChannelUserList(ChannelUserReq req);
}
