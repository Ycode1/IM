package chat.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author asus
 */
@Mapper
public interface IUserGroupDao {

    List<String> queryUserGroupsIdList(String userId);

}
