package cn.wdx.chat.domain.inet.repository;

import cn.wdx.chat.domain.inet.model.ChannelUserInfo;
import cn.wdx.chat.domain.inet.model.ChannelUserReq;

import java.util.List;

public interface IInetRepository {

    Long queryChannelUserCount(ChannelUserReq req);

    List<ChannelUserInfo> queryChannelUserList(ChannelUserReq req);

}
