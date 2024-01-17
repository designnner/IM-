package cn.wdx.protocol;

import cn.wdx.agreement.ObjType;
import cn.wdx.agreement.Packet;

/**
 * @author wudanxin
 * @version 1.0
 * @description: TODO
 * @date 2024-01-16 19:46
 */
public class LoginResponse extends Packet {

    @Override
    public int getType() {
        return ObjType.LoginResponse.ordinal();
    }
}
