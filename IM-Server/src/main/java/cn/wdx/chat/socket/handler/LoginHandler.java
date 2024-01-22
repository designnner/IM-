package cn.wdx.chat.socket.handler;

import cn.wdx.chat.protocol.login.LoginRequest;
import cn.wdx.chat.socket.MyBizHandler;
import io.netty.channel.Channel;

/**
 * @author wudanxin
 * @version 1.0
 * @description: TODO
 * @date 2024-01-22 15:04
 */
public class LoginHandler extends MyBizHandler<LoginRequest> {
    @Override
    public void channelRead(Channel ctx, LoginRequest msg) {

    }
}
