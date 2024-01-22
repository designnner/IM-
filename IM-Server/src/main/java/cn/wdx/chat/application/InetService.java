package cn.wdx.chat.application;

import cn.wdx.chat.domain.inet.model.ChannelUserInfo;
import cn.wdx.chat.domain.inet.model.ChannelUserReq;
import cn.wdx.chat.domain.inet.model.InetServerInfo;

import java.util.List;

/**
 * @author wudanxin
 * @version 1.0
 * @description: TODO
 * @date 2024-01-22 14:49
 */
public interface InetService {
    InetServerInfo queryNettyServerInfo();

    Long queryChannelUserCount(ChannelUserReq req);

    List<ChannelUserInfo> queryChannelUserList(ChannelUserReq req);
}
