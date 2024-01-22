package cn.wdx.chat.domain.inet.service;

import cn.wdx.chat.application.InetService;
import cn.wdx.chat.domain.inet.model.ChannelUserInfo;
import cn.wdx.chat.domain.inet.model.ChannelUserReq;
import cn.wdx.chat.domain.inet.model.InetServerInfo;
import cn.wdx.chat.domain.inet.repository.IInetRepository;
import cn.wdx.chat.infrastructure.common.SocketChannelUtil;
import cn.wdx.chat.socket.NettyServer;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wudanxin
 * @version 1.0
 * @description: TODO
 * @date 2024-01-22 14:50
 */
@Service
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

        for(ChannelUserInfo channelUserInfo:channelUserInfoList){
            Channel channel = SocketChannelUtil.getChannel(channelUserInfo.getUserId());

            if(null == channel || !channel.isActive()){
                channelUserInfo.setStatus(false);
            }else{
                channelUserInfo.setStatus(true);
            }


        }


        return channelUserInfoList;
    }
}
