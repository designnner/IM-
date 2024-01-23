package cn.wdx.chat.infrastructure.mapper;

import cn.wdx.chat.domain.inet.model.ChannelUserInfo;
import cn.wdx.chat.domain.inet.model.ChannelUserReq;
import cn.wdx.chat.infrastructure.po.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author wudanxin
* @description 针对表【user】的数据库操作Mapper
* @createDate 2024-01-22 11:13:11
* @Entity cn.wdx.chat.infrastructure.po.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

    Long queryChannelUserCount(ChannelUserReq req);

    List<User> queryChannelUserList(ChannelUserReq req);


}




