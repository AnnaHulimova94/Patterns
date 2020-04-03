package ua.hulimova.patterns.decorator;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.List;

public class EncodeMessageSenderDecorator implements MessageSender {

    private MessageSender messageSender;

    public EncodeMessageSenderDecorator(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    @Override
    public void sendMessage(String message) {
        messageSender.sendMessage(DigestUtils.md5Hex(message));
    }
}
