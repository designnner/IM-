package cn.wdx.chat.codec;

import cn.wdx.chat.protocol.Packet;
import cn.wdx.chat.util.SerializationUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @author wudanxin
 * @version 1.0
 * @description: TODO
 * @date 2024-01-17 10:41
 */
public class ObjEncode extends MessageToByteEncoder<Packet> {
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Packet packet, ByteBuf byteBuf) throws Exception {

        byte[] data = SerializationUtil.serialize(packet);

        int type = packet.getType();

        int len = data.length+4;

        byteBuf.writeInt(len);

        byteBuf.writeInt(type);

        byteBuf.writeBytes(data);


    }
}
