package cn.wdx.ui;

import cn.wdx.ui.view.ILoginMethod;
import cn.wdx.ui.view.Login;
import cn.wdx.ui.view.LoginController;
import javafx.stage.Stage;

/**
 * @author wudanxin
 * @version 1.0
 * @description: TODO
 * @date 2024-01-15 19:32
 */
public class Application extends javafx.application.Application{
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
