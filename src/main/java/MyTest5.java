import java.util.Random;

public class MyTest5 {

    public static void main(String[] args) {
        /**
         * 当一个接口在初始化时，并不要求其父接口都完成了初始化
         * 只有在真正使用到父接口的时候(如应用接口中定义的常量)，才会完成初始化
         */

        // 当一个类被初始化的时候不会初始化他的接口
        System.out.println(MyChild5_1.b);

        // 当一个类被初始化的时候会初始化他的所欲父类
        System.out.println(MyChild5_2.b);

        // 当一个接口初始化的时候不会初始化他的父接口
        System.out.println(MyChild5_3.thread);
    }
}

//案例一
interface MyParent5_1 {
    public static Thread thread = new Thread() {
        {
            System.out.println("MyParent5_1 invoked");
        }
    };
}

class MyChild5_1 implements MyParent5_1 {
    public static int b = 5;
}

//案例二
class MyParent5_2 {
    public static Thread thread = new Thread() {
        {
            System.out.println("MyParent5_2 invoked");
        }
    };
}

class MyChild5_2 extends MyParent5_2 {
    public static int b = 5;
}


//案例三
interface MyParent5_3 {
    public static Thread thread = new Thread() {
        {
            System.out.println("MyParent5_3 invoked");
        }
    };
}

interface MyChild5_3 extends MyParent5_3 {
    public static Thread thread = new Thread() {
        {
            System.out.println("MyChild5_3 invoked");
        }
    };
}