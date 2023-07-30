package chat.infrastructure.dao;

import chat.infrastructure.po.Groups;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author asus
 */
@Mapper
public interface IGroupsDao {

    Groups queryGroupsById(String groupsId);

}
