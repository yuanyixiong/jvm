public class MyTest7 {
    public static void main(String[] args) throws ClassNotFoundException {

        /**类加载器**/
        //父亲委托机制
        //1.根类加载器:Bootstrap ClassLoader $JAVA_HOME中jar/lib/rt.jar里面所有的class由C++实现，不是ClassLoader子类
        //2.扩展类加载器:Extension ClassLoader 负责加载java平台中扩展的一些jar包,包括$JAVA_HOME中jar/lib/*.jar或-Djava.ext.dirs指定目录下的jar包
        //3.系统类加载器:App ClassLoader 负责加载classpath中指定的jar包及目录中class
        //4.自定义加载器

        //定义类加载器:真正加载类的那个加载器
        //初始类加载器:能够返回加载类的加载器

        //Class.getClassLoader() 返回的是"定义加类载器"

        //使用的:跟(bootstrap)类加载器
        Class<?> clazz1 = Class.forName("java.lang.String");
        System.out.println(clazz1.getClassLoader());

        //使用的:AppClassLoader类加载器
        Class<?> clazz2 = Class.forName("C");
        System.out.println(clazz2.getClassLoader());
    }
}

class C {

}
