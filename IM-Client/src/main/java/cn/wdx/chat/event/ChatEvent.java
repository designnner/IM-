package cn.wdx.chat.event;

import cn.wdx.ui.view.chat.IChatEvent;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;

import java.util.Date;

/**
 * @author wudanxin
 * @version 1.0
 * @description: TODO
 * @date 2024-01-22 10:30
 */
public class ChatEvent implements IChatEvent {
    @Override
    public void doQuit() {

    }

    @Override
    public void doSendMsg(String userId, String talkId, Integer talkType, String msg, Integer msgType, Date msgDate) {

    }

    @Override
    public void doEventAddTalkUser(String userId, String userFriendId) {

    }

    @Override
    public void doEventAddTalkGroup(String userId, String groupId) {

    }

    @Override
    public void doEventDelTalkUser(String userId, String talkId) {

    }

    @Override
    public void addFriendLuck(String userId, ListView<Pane> listView) {

    }

    @Override
    public void doFriendLuckSearch(String userId, String text) {

    }

    @Override
    public void doEventAddLuckUser(String userId, String friendId) {

    }
}
