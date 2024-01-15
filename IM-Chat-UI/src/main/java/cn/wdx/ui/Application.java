package cn.wdx.ui;

import cn.wdx.ui.view.Login;
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
        Login login = new Login();
        login.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
