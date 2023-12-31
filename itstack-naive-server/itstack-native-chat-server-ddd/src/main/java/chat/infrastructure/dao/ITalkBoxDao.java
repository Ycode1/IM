package chat.infrastructure.dao;

import chat.infrastructure.po.TalkBox;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author asus
 */
@Mapper
public interface ITalkBoxDao {

    List<TalkBox> queryTalkBoxList(String userId);

    void addTalkBox(TalkBox talkBox);

    void deleteUserTalk(String userId, String talkId);

    TalkBox queryTalkBox(String userId, String talkId);

    List<String> queryTalkBoxGroupsIdList(String userId);

}
