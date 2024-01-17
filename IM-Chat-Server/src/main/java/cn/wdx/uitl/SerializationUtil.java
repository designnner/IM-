package cn.wdx.uitl;

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtostuffIOUtil;
import com.dyuproject.protostuff.Schema;
import com.dyuproject.protostuff.runtime.RuntimeSchema;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wudanxin
 * @version 1.0
 * @description: TODO
 * @date 2024-01-17 10:49
 */
public class SerializationUtil {

    private static Map<Class<?>, Schema<?>> classSchemaMap = new ConcurrentHashMap<>();




    public static <T> byte[] serialize(T obj){

        Class<T> clazz =(Class<T>) obj.getClass();
        LinkedBuffer buffer = LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE);

        try{
            Schema<T> schema = getSchema(clazz);



            byte[] bytes = ProtostuffIOUtil.toByteArray(obj, schema, buffer);

            return bytes;
        }catch (Exception e){
            throw new IllegalArgumentException(e.getMessage(),e);
        }finally {
            buffer.clear();
        }


    }


    public static <T> T deserialize(Class<T> clazz,byte[] data) throws InstantiationException, IllegalAccessException {


        T message = clazz.newInstance();

        Schema<T> schema = getSchema(clazz);

        ProtostuffIOUtil.mergeFrom(data,message,schema);

        return message;

    }




    private static <T> Schema<T> getSchema(Class<T> cls){
        Schema<T> schema = (Schema<T>) classSchemaMap.get(cls);

        if(schema == null){
            schema = RuntimeSchema.createFrom(cls);
            classSchemaMap.put(cls,schema);
        }

        return schema;


    }

}
