package chat.domain.inet.model;

import chat.infrastructure.common.PageReq;
import lombok.Data;

/**
 * @author yangmingjun
 * @data 2023/8/10 23:12
 */
@Data
public class ChannelUserReq extends PageReq {
    private String userId;
    private String userNickName;
}
