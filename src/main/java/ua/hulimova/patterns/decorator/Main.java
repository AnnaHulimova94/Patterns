package ua.hulimova.patterns.decorator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String firstMessage = "Hello Yehor! I love you";
        MessageSender messageSender = new TelegramMessageSender();
        messageSender.sendMessage(firstMessage);

        messageSender = new EncodeMessageSenderDecorator(new FacebookMessageSender());
        messageSender.sendMessage(firstMessage);

        messageSender = new MediaMessageSenderDecorator(new TelegramMessageSender());
        messageSender.sendMessage(firstMessage);
    }
}
