import sun.misc.Launcher;

public class MyTest23 {

    public static void main(String[] args) {

        ///Volumes/Office/jvm/target/classes
        //java MyTest23
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));

        /*
            java -Dsun.boot.class.path=./ MyTest23
            在Oracle的Hosport实现中，系统属性sun.boot.class.path如果修改错了，则运行会出错，提示如下错误信息
            Error occurred during initialization of VM
            java/lang/NoClassDefFoundError: java/lang/Object
         */

        /*
            内建与JVM中的启动类加载器会加载java.lang.ClassLoader以及其他的Java平台类,
            当JVM启动时,一块特殊的机器码会运行，他会加载扩展类加载器与系统类加载器。

            启动类加载器并不是Java类，而其他的加载器则都是Java类,启动类加载器是特定于平台的机器指令,它负责开启整个加载过程。

            所有类加载器(除了启动类加载器)都被实现为Java类。不过，总归要有一个组件来加载第一个Java类加载器，从而让整个加载过程能够顺利加载。

            启动类加载器还会负责供JRE正常运行所需的基础组件，这里包括java.util与java.lang包中的类等等....
         */

        System.out.println(ClassLoader.class.getClassLoader());
        //扩展类加载器(ExtClassLoader)与系统类加载器(AppClassLoader)也是由启动类加载器所加载的
        System.out.println(Launcher.class.getClassLoader());

        //系统类加载器
        System.out.println(ClassLoader.getSystemClassLoader());
        System.out.println(System.getProperty("java.system.class.loader"));
        System.out.println(MyTest23.class.getClassLoader());
        System.out.println(ClassLoader.class.getClassLoader());


    }
}
