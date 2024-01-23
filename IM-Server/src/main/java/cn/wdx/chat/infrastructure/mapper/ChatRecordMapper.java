package cn.wdx.chat.infrastructure.mapper;

import cn.wdx.chat.infrastructure.po.ChatRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author wudanxin
* @description 针对表【chat_record】的数据库操作Mapper
* @createDate 2024-01-22 11:13:11
* @Entity cn.wdx.chat.infrastructure.po.ChatRecord
*/
@Mapper
public interface ChatRecordMapper extends BaseMapper<ChatRecord> {
    void appendChatRecord(ChatRecord req);

    List<ChatRecord> queryUserChatRecordList(String talkId,String userId);


    List<ChatRecord> queryGroupsChatRecordList(String talkId, String userId);


}




