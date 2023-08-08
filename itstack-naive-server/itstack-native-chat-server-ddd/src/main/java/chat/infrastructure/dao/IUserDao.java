package chat.infrastructure.dao;

import chat.infrastructure.po.User;

import java.util.List;

/**
 * @author asus
 */
public interface IUserDao {
    String queryUserPassword(String userId);

    User queryUserById(String userId);

    List<User> queryFuzzyUserList(String userId, String searchKey);



}