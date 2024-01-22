package cn.wdx.chat.event;

import cn.wdx.chat.infrastructure.util.BeanUtil;
import cn.wdx.chat.infrastructure.util.CacheUtil;
import cn.wdx.chat.protocol.login.LoginRequest;
import cn.wdx.ui.view.login.ILoginEvent;
import io.netty.channel.Channel;

/**
 * @author wudanxin
 * @version 1.0
 * @description: TODO
 * @date 2024-01-22 10:30
 */
public class LoginEvent implements ILoginEvent {
    @Override
    public void doLoginCheck(String userId, String userPassword) {
        Channel channel = BeanUtil.getBean("channel", Channel.class);

        channel.writeAndFlush(new LoginRequest(userId,userPassword));

        CacheUtil.userId = userId;

    }
}
