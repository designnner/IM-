package cn.wdx.agreement;

import cn.wdx.protocol.LoginRequest;
import cn.wdx.protocol.LoginResponse;

public enum ObjType {

    LoginRequest(cn.wdx.protocol.LoginRequest.class),
    LoginResponse(cn.wdx.protocol.LoginResponse.class);

    private final Class<? extends Packet> clazz;
    ObjType(Class<? extends Packet> clazz) {
        this.clazz = clazz;
    }

    public Class<? extends Packet> getClazz() {
        return clazz;
    }
}
