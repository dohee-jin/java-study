package polyexample;

public class User extends Messenger{

    // private String name;
    // 필드를 부모 클래스에서 생성

    public User(String name) {
        // this.name = name;
        // super 키워드 사용
        super(name);
    }

    @Override
    void sendMessage(String message) {
        System.out.printf("[사용자] %s: %s\n", getName(), message);
    }
}
