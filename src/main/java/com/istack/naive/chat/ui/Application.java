package com.istack.naive.chat.ui;

import com.istack.naive.chat.ui.view.login.ILoginMethod;
import com.istack.naive.chat.ui.view.login.LoginController;
import javafx.stage.Stage;

/**
 * 窗口          Stage
 * -场景       Scene
 * -布局     stackPane
 * -控件   Button
 */
public class Application extends javafx.application.Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ILoginMethod login = new LoginController((userId, userPassword) -> {
            System.out.println("登陆 userId：" + userId + "userPassword：" + userPassword);
        });

        login.doShow();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
