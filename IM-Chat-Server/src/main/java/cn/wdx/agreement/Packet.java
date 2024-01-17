package cn.wdx.agreement;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wudanxin
 * @version 1.0
 * @description: TODO
 * @date 2024-01-16 19:35
 */
public abstract class Packet {

    private final static Map<ObjType,Class<? extends Packet>> packetType = new ConcurrentHashMap<>();


    static {
        packetType.put(ObjType.LoginRequest,ObjType.LoginRequest.getClazz());
        packetType.put(ObjType.LoginResponse,ObjType.LoginResponse.getClazz());
    }

    public static Class<? extends Packet> get(ObjType type){
        return packetType.get(type);
    }


    public abstract int getType();


}
