package chat.domain.inet.service;

import chat.application.InetService;
import chat.domain.inet.model.ChannelUserInfo;
import chat.domain.inet.model.ChannelUserReq;
import chat.domain.inet.model.InetServerInfo;
import chat.domain.inet.repository.IInetRepository;
import chat.infrastructure.common.SocketChannelUtil;
import chat.socket.NettyServer;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yangmingjun
 * @data 2023/8/10 23:23
 */
@Service("inetService")
public class InetServiceImpl implements InetService {
    private Logger logger = LoggerFactory.getLogger(InetServiceImpl.class);

    @Value("${netty.ip}")
    private String ip;
    @Value("${netty.port}")
    private int port;

    @Resource
    private NettyServer nettyServer;
    @Resource
    private IInetRepository inetRepository;

    @Override
    public InetServerInfo queryNettyServerInfo() {
        InetServerInfo inetServerInfo = new InetServerInfo();
        inetServerInfo.setIp(ip);
        inetServerInfo.setPort(port);
        inetServerInfo.setStatus(nettyServer.channel().isActive());
        return inetServerInfo;
    }

    @Override
    public Long queryChannelUserCount(ChannelUserReq req) {
        return inetRepository.queryChannelUserCount(req);
    }

    @Override
    public List<ChannelUserInfo> queryChannelUserList(ChannelUserReq req) {
        List<ChannelUserInfo> channelUserInfoList = inetRepository.queryChannelUserList(req);
        for (ChannelUserInfo channelUserInfo : channelUserInfoList) {
            Channel channel = SocketChannelUtil.getChannel(channelUserInfo.getUserId());
            if (null == channel || !channel.isActive()) {
                channelUserInfo.setStatus(false);
            } else {
                channelUserInfo.setStatus(true);
            }
        }
        return channelUserInfoList;
    }
}
