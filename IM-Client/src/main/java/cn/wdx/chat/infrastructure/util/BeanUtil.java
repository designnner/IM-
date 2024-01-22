package cn.wdx.chat.infrastructure.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wudanxin
 * @version 1.0
 * @description: TODO
 * @date 2024-01-22 10:53
 */
public class BeanUtil {

    private static Map<String,Object> cacheMap = new ConcurrentHashMap<>();

    public static synchronized void addBean(String name,Object obj){
        cacheMap.put(name,obj);
    }

    public static <T> T getBean(String name,Class<T> clazz){
        return (T) cacheMap.get(name);
    }


}
