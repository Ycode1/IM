package chat.domain.inet.repository;

import chat.domain.inet.model.ChannelUserInfo;
import chat.domain.inet.model.ChannelUserReq;

import java.util.List;

/**
 * @author yangmingjun
 * @data 2023/8/10 23:22
 */
public interface IInetRepository {

    Long queryChannelUserCount(ChannelUserReq req);

    List<ChannelUserInfo> queryChannelUserList(ChannelUserReq req);
}
