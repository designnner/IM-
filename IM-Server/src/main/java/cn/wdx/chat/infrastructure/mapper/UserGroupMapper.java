package cn.wdx.chat.infrastructure.mapper;

import cn.wdx.chat.infrastructure.po.UserGroup;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author wudanxin
* @description 针对表【user_group】的数据库操作Mapper
* @createDate 2024-01-22 11:13:11
* @Entity cn.wdx.chat.infrastructure.po.UserGroup
*/
@Mapper
public interface UserGroupMapper extends BaseMapper<UserGroup> {
    List<String> queryUserGroupsIdList(String userId);
}




