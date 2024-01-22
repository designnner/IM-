package cn.wdx.chat.protocol.login;

import cn.wdx.chat.protocol.ObjType;
import cn.wdx.chat.protocol.Packet;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author wudanxin
 * @version 1.0
 * @description: TODO
 * @date 2024-01-16 19:44
 */
@Data
@AllArgsConstructor
public class LoginRequest extends Packet {
    private String userId;        // 用户ID

    private String userPassword;  // 用户密码

    @Override
    public int getType() {
        return ObjType.LoginRequest.ordinal();
    }
}
