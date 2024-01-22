package cn.wdx.chat.domain.inet.model;

import cn.wdx.chat.infrastructure.common.PageReq;

/**
 * @author wudanxin
 * @version 1.0
 * @description: TODO
 * @date 2024-01-22 14:27
 */
public class ChannelUserReq extends PageReq {

    private String userId;
    private String userNickName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }
}