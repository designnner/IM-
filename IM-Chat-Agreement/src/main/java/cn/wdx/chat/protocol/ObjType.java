package cn.wdx.chat.protocol;


public enum ObjType {

    LoginRequest(cn.wdx.chat.protocol.login.LoginRequest.class),
    LoginResponse(cn.wdx.chat.protocol.login.LoginRequest.class);

    private final Class<? extends Packet> clazz;
    ObjType(Class<? extends Packet> clazz) {
        this.clazz = clazz;
    }

    public Class<? extends Packet> getClazz() {
        return clazz;
    }
}
