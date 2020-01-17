import java.util.Random;

public class MyTest8 {

    public static void main(String[] args) {
        System.out.println(FinalTest1.a);
        System.out.println(FinalTest2.a);
        System.out.println(FinalTest3.a);
    }
}

class FinalTest1 {

    public static final int a = 1;

    static {
        //初始化
        System.out.println("FinalTest1");
    }
}


class FinalTest2 {

    public static int a = 1;

    static {
        //初始化
        System.out.println("FinalTest2");
    }
}



class FinalTest3 {

    public static final int a = new Random().nextInt(5);

    static {
        //初始化
        System.out.println("FinalTest3");
    }
}