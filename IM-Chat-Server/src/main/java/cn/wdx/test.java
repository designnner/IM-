package cn.wdx;

import cn.wdx.agreement.ObjType;
import org.junit.Test;

/**
 * @author wudanxin
 * @version 1.0
 * @description: TODO
 * @date 2024-01-16 20:04
 */
public class test {

    @Test
    public void tt(){
        int ordinal = ObjType.LoginRequest.ordinal();
        System.out.println(ordinal);

        ObjType[] values = ObjType.values();

        System.out.println(values[ordinal].getClazz());
    }
}
