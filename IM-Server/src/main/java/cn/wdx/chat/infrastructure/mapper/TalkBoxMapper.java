package cn.wdx.chat.infrastructure.mapper;

import cn.wdx.chat.infrastructure.po.TalkBox;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author wudanxin
* @description 针对表【talk_box】的数据库操作Mapper
* @createDate 2024-01-22 11:13:11
* @Entity cn.wdx.chat.infrastructure.po.TalkBox
*/
@Mapper
public interface TalkBoxMapper extends BaseMapper<TalkBox> {
    List<TalkBox> queryTalkBoxList(String userId);

    void addTalkBox(TalkBox talkBox);

    void deleteUserTalk(String userId,String talkId);

    TalkBox queryTalkBox(String userId,String talkId);

    List<String> queryTalkBoxGroupsIdList(String userId);


}




