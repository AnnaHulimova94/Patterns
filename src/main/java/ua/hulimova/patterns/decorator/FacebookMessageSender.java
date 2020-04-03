package ua.hulimova.patterns.decorator;

class FacebookMessageSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("message was sent to facebook: " + message);
    }
}
