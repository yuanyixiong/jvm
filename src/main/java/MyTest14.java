import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class MyTest14 {

    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        String resourceName = "MyTest14.class";

        Enumeration<URL> urls = classLoader.getResources(resourceName);

        while (urls.hasMoreElements()) {
            URL url = urls.nextElement();
            System.out.println(url);
        }

        System.out.println("=====================");
        System.out.println(MyTest14.class.getClassLoader());
        System.out.println("=====================");
        System.out.println(String.class.getClassLoader());
    }

}
