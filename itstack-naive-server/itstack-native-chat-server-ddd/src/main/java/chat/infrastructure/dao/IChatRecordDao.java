package chat.infrastructure.dao;

import chat.infrastructure.po.ChatRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author asus
 */
@Mapper
public interface IChatRecordDao {

    void appendChatRecord(ChatRecord req);

    List<ChatRecord> queryUserChatRecordList(String talkId, String userId);

    List<ChatRecord> queryGroupsChatRecordList(String talkId, String userId);

}
