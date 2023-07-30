package com.istack.naive.chat.ui;

import com.istack.naive.chat.ui.view.chat.ChatController;
import com.istack.naive.chat.ui.view.chat.IChatMethod;
import javafx.stage.Stage;

/**
 * 窗口          Stage
 *      -场景    Scene
 *      -布局    stackPane
 *      -控件    Button
 * @author asus
 */
public class Application extends javafx.application.Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        IChatMethod chat = new ChatController();
        chat.doShow();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
