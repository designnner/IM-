package cn.wdx.codec;

import cn.wdx.agreement.ObjType;
import cn.wdx.agreement.Packet;
import cn.wdx.uitl.SerializationUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * @author wudanxin
 * @version 1.0
 * @description: TODO
 * @date 2024-01-17 10:55
 */
public class ObjDecode extends ByteToMessageDecoder {

    private static final int BASE_DATA_LENGTH = 4;

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        if(byteBuf.readableBytes() < BASE_DATA_LENGTH){
            return ;
        }
        byteBuf.markReaderIndex();
        int dt_Len = byteBuf.readInt();


        if(byteBuf.readableBytes() < dt_Len){
            byteBuf.resetReaderIndex();
            return ;
        }

        int tp = byteBuf.readInt();

        byte[] data = new byte[dt_Len - 4];

        byteBuf.readBytes(data);

        Class<? extends Packet> clazz = ObjType.values()[tp].getClazz();

        Packet packet = SerializationUtil.deserialize(clazz, data);

        list.add(packet);


    }
}
