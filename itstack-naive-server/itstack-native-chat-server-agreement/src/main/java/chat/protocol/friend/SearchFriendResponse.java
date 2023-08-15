package chat.protocol.friend;

import chat.protocol.Command;
import chat.protocol.Packet;
import chat.protocol.friend.dto.UserDto;

import java.util.List;


/**
 *
 * 搜索好友应答
 * @author asus
 */
public class SearchFriendResponse extends Packet {

    private List<UserDto> list;

    public List<UserDto> getList() {
        return list;
    }

    public void setList(List<UserDto> list) {
        this.list = list;
    }

    @Override
    public Byte getCommand() {
        return Command.SearchFriendResponse;
    }
}
