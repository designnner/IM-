package cn.wdx.chat.socket;

import cn.wdx.chat.codec.ObjDecode;
import cn.wdx.chat.codec.ObjEncode;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

/**
 * @author wudanxin
 * @version 1.0
 * @description: TODO
 * @date 2024-01-22 14:06
 */
public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {




    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        //对象传输处理[解码]
        channel.pipeline().addLast(new ObjDecode());
        // 在管道中添加我们自己的接收数据实现方法
//        channel.pipeline().addLast(new AddFriendHandler(userService));
//        channel.pipeline().addLast(new DelTalkHandler(userService));
//        channel.pipeline().addLast(new LoginHandler(userService));
//        channel.pipeline().addLast(new MsgGroupHandler(userService));
//        channel.pipeline().addLast(new MsgHandler(userService));
//        channel.pipeline().addLast(new ReconnectHandler(userService));
//        channel.pipeline().addLast(new SearchFriendHandler(userService));
//        channel.pipeline().addLast(new TalkNoticeHandler(userService));
        //对象传输处理[编码]
        channel.pipeline().addLast(new ObjEncode());
    }
}
