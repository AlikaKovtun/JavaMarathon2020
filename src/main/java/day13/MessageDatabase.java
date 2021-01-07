package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {

    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));

    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message ms : messages) {
            if ((ms.getSender().getUsername().equals(u1.getUsername()) && ms.getReceiver().getUsername().equals(u2.getUsername())) ||
                    ms.getSender().getUsername().equals(u2.getUsername()) && ms.getReceiver().getUsername().equals(u1.getUsername()))
                System.out.println(ms.getText());
        }

    }

}
