package ua.hulimova.patterns.decorator;

class TelegramMessageSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("message was sent to telegram: " + message);
    }
}
