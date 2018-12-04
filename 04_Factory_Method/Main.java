import framework.*;
import idcard.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product idcard1 = factory.create("홍길동");
        Product idcard2 = factory.create("이순신");
        Product idcard3 = factory.create("강감찬");

        idcard1.use();
        idcard2.use();
        idcard3.use();
    }
}