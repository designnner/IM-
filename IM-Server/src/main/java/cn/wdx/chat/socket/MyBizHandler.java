package cn.wdx.chat.socket;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author wudanxin
 * @version 1.0
 * @description: TODO
 * @date 2024-01-22 14:05
 */
public abstract class MyBizHandler<T> extends SimpleChannelInboundHandler<T> {




    public abstract void channelRead(Channel ctx, T msg);

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
        System.out.println("断开连接了");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        System.out.println("关闭" + ctx.channel().id());
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, T t) throws Exception {
        channelRead(ctx.channel(),t);
    }
}
