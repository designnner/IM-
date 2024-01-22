package cn.wdx.chat.socket;

import cn.wdx.chat.infrastructure.util.BeanUtil;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Callable;

/**
 * @author wudanxin
 * @version 1.0
 * @description: TODO
 * @date 2024-01-22 10:12
 */
public class NettyClient implements Callable<Channel> {

    private Logger logger = LoggerFactory.getLogger(NettyClient.class);

    private String inetHost = "127.0.0.1";

    private int inetPort = 7397;

    private EventLoopGroup workGroup = new NioEventLoopGroup();

    private Channel channel;



    @Override
    public Channel call() throws Exception {

        ChannelFuture channelFuture = null;

        try{
            Bootstrap b = new Bootstrap();

            b.group(workGroup);
            b.channel(NioSocketChannel.class);
            b.option(ChannelOption.AUTO_READ,true);
            b.handler(new MyChannelInitializer());
            channelFuture = b.connect(inetHost, inetPort).syncUninterruptibly();

            this.channel = channelFuture.channel();
            BeanUtil.addBean("channel",channel);

        }catch (Exception e){
            logger.error("socket client start error", e.getMessage());
        }finally {
            if(null != channelFuture && channelFuture.isSuccess()){
                logger.info("socket client start done.");
            }else{
                logger.error("socket client start error.");
            }
        }



        return channel;
    }

    public void destory(){
        if(null == channel) return ;
        channel.close();
        workGroup.shutdownGracefully();

    }
    public boolean isActive(){
        return channel.isActive();
    }

    public Channel channel() {
        return channel;
    }



}
