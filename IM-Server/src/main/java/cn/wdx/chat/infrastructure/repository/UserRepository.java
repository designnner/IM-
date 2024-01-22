package cn.wdx.chat.infrastructure.repository;

import cn.hutool.system.UserInfo;
import cn.wdx.chat.domain.user.model.*;
import cn.wdx.chat.domain.user.repository.IUserRepository;
import cn.wdx.chat.infrastructure.mapper.*;
import cn.wdx.chat.infrastructure.po.UserFriend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wudanxin
 * @version 1.0
 * @description: TODO
 * @date 2024-01-22 16:08
 */
@Repository
public class UserRepository implements IUserRepository {
    @Autowired
    private ChatRecordMapper chatRecordMapper;
    @Autowired
    private CgroupsMapper cgroupsMapper;
    @Autowired
    private TalkBoxMapper talkBoxMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserFriendMapper userFriendMapper;
    @Autowired
    private UserGroupMapper userGroupMapper;

    @Override
    public String queryUserPassword(String userId) {




        return null;
    }

    @Override
    public UserInfo queryUserInfo(String userId) {
        return null;
    }

    @Override
    public List<TalkBoxInfo> queryTalkBoxInfoList(String userId) {
        return null;
    }

    @Override
    public void addTalkBoxInfo(String userId, String talkId, Integer talkType) {

    }

    @Override
    public List<UserFriendInfo> queryUserFriendInfoList(String userId) {
        return null;
    }

    @Override
    public List<GroupsInfo> queryUserGroupInfoList(String userId) {
        return null;
    }

    @Override
    public List<LuckUserInfo> queryFuzzyUserInfoList(String userId, String searchKey) {
        return null;
    }

    @Override
    public void addUserFriend(List<UserFriend> userFriendList) {

    }

    @Override
    public void appendChatRecord(ChatRecordInfo chatRecordInfo) {

    }

    @Override
    public List<ChatRecordInfo> queryChatRecordInfoList(String talkId, String userId, Integer talkType) {
        return null;
    }

    @Override
    public void deleteUserTalk(String userId, String talkId) {

    }

    @Override
    public List<String> queryUserGroupsIdList(String userId) {
        return null;
    }

    @Override
    public List<String> queryTalkBoxGroupsIdList(String userId) {
        return null;
    }
}
