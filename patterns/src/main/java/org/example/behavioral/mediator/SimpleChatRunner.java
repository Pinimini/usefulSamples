package org.example.behavioral.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "admin");
        User user1 = new Admin(chat, "user1");
        User user2 = new Admin(chat, "user2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello, I am user 1!!!");

        admin.sendMessage("Roger that, I am admin!!!");
    }
}
