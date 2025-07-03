package chap1_9.final_.singletpn;


public class Main {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);


        s1.a = 100;
        s2.a = 300;
        s3.a = 900;

        System.out.println(s1.a);
        System.out.println(s2.a);
        System.out.println(s3.a);

    }


;}
