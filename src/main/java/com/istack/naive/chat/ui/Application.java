package com.istack.naive.chat.ui;

import com.istack.naive.chat.ui.view.Login;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Login login = new Login();
        login.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
