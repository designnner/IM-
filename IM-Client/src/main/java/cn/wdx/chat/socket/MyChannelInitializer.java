package cn.wdx.chat.socket;

import cn.wdx.chat.codec.ObjDecode;
import cn.wdx.chat.codec.ObjEncode;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;

/**
 * @author wudanxin
 * @version 1.0
 * @description: TODO
 * @date 2024-01-22 10:18
 */
public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        ChannelPipeline pipeline = channel.pipeline();

        pipeline.addLast(new ObjDecode());

        pipeline.addLast(new ObjEncode());

    }
}
