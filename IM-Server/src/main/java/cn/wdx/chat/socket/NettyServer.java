package cn.wdx.chat.socket;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.ServerSocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Callable;

/**
 * @author wudanxin
 * @version 1.0
 * @description: TODO
 * @date 2024-01-22 14:08
 */
public class NettyServer implements Callable<Channel> {

    private Logger logger = LoggerFactory.getLogger(NettyServer.class);

    private int inetPort = 7397;

    private EventLoopGroup parentGroup = new NioEventLoopGroup();

    private EventLoopGroup workGroup = new NioEventLoopGroup();

    private Channel channel;




    @Override
    public Channel call() throws Exception {
        ChannelFuture channelFuture = null;

        try{
            ServerBootstrap b = new ServerBootstrap();

            b.group(parentGroup,workGroup);
            b.channel(NioServerSocketChannel.class);
            b.option(ChannelOption.SO_BACKLOG,128);
            b.childHandler(new MyChannelInitializer());

            channelFuture = b.bind(inetPort).syncUninterruptibly();

            this.channel = channelFuture.channel();



        }catch (Exception e){
            logger.error("socket server start done.",e.getMessage());
        }finally {
            if(null != channelFuture && channelFuture.isSuccess()){
                logger.info("socket server start done.");
            }else{
                logger.error("socket server start error.");
            }
        }



        return channel;
    }

    public void destory(){
        if(null == channel) return;
        channel.close();
        parentGroup.shutdownGracefully();
        workGroup.shutdownGracefully();
    }

    public Channel channel(){
        return channel;
    }


}
