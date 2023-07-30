package chat.infrastructure.dao;

import chat.infrastructure.po.UserFriend;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author asus
 */
@Mapper
public interface IUserFriendDao {

    List<String> queryUserFriendIdList(String userId);

    UserFriend queryUserFriendById(UserFriend req);

    void addUserFriendList(List<UserFriend> list);

}
