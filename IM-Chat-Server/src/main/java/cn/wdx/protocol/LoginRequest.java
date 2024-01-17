package cn.wdx.protocol;

import cn.wdx.agreement.ObjType;
import cn.wdx.agreement.Packet;
import lombok.Data;

/**
 * @author wudanxin
 * @version 1.0
 * @description: TODO
 * @date 2024-01-16 19:44
 */
@Data
public class LoginRequest extends Packet {
    private String userId;        // 用户ID

    private String userPassword;  // 用户密码

    @Override
    public int getType() {
        return ObjType.LoginRequest.ordinal();
    }
}
