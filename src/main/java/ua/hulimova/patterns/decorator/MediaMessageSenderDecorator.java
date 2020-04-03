package ua.hulimova.patterns.decorator;

import java.util.List;

class MediaMessageSenderDecorator implements MessageSender {
    private MessageSender messageSender;

    MediaMessageSenderDecorator(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("message was sent to facebook: " + message);
        messageSender.sendMessage(message);
    }
}
