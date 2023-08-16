package src.main.java.chat.client;

import chat.protocol.login.ReconnectRequest;
import io.netty.channel.Channel;
import javafx.stage.Stage;
import org.itstack.naive.chat.ui.view.chat.ChatController;
import org.itstack.naive.chat.ui.view.chat.IChatMethod;
import org.itstack.naive.chat.ui.view.login.ILoginMethod;
import org.itstack.naive.chat.ui.view.login.LoginController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import src.main.java.chat.client.application.UIService;
import src.main.java.chat.client.event.ChatEvent;
import src.main.java.chat.client.event.LoginEvent;
import src.main.java.chat.client.infrastructure.util.CacheUtil;


import java.util.concurrent.*;

/**
 * @author yangmingjun
 * @data 2023/8/16 23:06
 */
public class Application   {

    private Logger logger = LoggerFactory.getLogger(Application.class);

    //默认线程池
    private static ExecutorService executorService = Executors.newFixedThreadPool(2);
    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);



}
