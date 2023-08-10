package chat.domain.inet.model;

import lombok.Data;

/**
 * @author yangmingjun
 * @data 2023/8/10 23:13
 */
@Data
public class InetServerInfo {
    /**
     * IP
     */
    private String ip;
    /**
     * 端口
     */
    private int port;
    /**
     * 状态；true开启、false关闭
     */
    private boolean status;
}
