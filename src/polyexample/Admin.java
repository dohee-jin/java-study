package polyexample;

public class Admin extends Messenger{

    public Admin(String name) {
        super(name);
    }

    @Override
    void sendMessage(String message) {
        System.out.printf("\uD83D\uDEA8[관리자] %s: %s\uD83D\uDEA8\n", getName(), message);
    }
}
