package cn.wdx.chat.infrastructure.repository;

import cn.wdx.chat.domain.inet.model.ChannelUserInfo;
import cn.wdx.chat.domain.inet.model.ChannelUserReq;
import cn.wdx.chat.domain.inet.repository.IInetRepository;
import cn.wdx.chat.infrastructure.mapper.UserMapper;
import cn.wdx.chat.infrastructure.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wudanxin
 * @version 1.0
 * @description: TODO
 * @date 2024-01-22 14:33
 */
@Repository
public class InetRepository implements IInetRepository {

    @Autowired
    private UserMapper userMapper;


    @Override
    public Long queryChannelUserCount(ChannelUserReq req) {
        return userMapper.queryChannelUserCount(req);
    }

    @Override
    public List<ChannelUserInfo> queryChannelUserList(ChannelUserReq req) {

        List<User> users = userMapper.queryChannelUserList(req);

        List<ChannelUserInfo> channelUserInfoList = new ArrayList<>();
        for(User user: users){
            ChannelUserInfo channelUserInfo = new ChannelUserInfo();
            channelUserInfo.setUserId(user.getUserid());
            channelUserInfo.setUserNickName(user.getUsernickname());
            channelUserInfo.setUserHead(user.getUserhead());
            channelUserInfoList.add(channelUserInfo);
        }

        return channelUserInfoList;
    }
}
