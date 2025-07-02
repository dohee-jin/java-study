package polyexample;

public class MessageRelay {

    public void relay(Messenger sender, String message) {
        /*if(sender instanceof User) {
            ((User) sender).sendMessage(message);
        } else if (sender instanceof Admin) {
            ((Admin) sender).sendMessage(message);
        }*/
        sender.sendMessage(message);
    }
}
