package cn.wdx.chat.infrastructure.mapper;

import cn.wdx.chat.infrastructure.po.Cgroups;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author wudanxin
* @description 针对表【cgroups】的数据库操作Mapper
* @createDate 2024-01-22 11:13:11
* @Entity cn.wdx.chat.infrastructure.po.Cgroups
*/
@Mapper
public interface CgroupsMapper extends BaseMapper<Cgroups> {
    Cgroups queryGroupsById(String groupId);
}




