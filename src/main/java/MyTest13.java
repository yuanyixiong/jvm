public class MyTest13 {

    //类加载器

    /**
     * sun.misc.Launcher$AppClassLoader@18b4aac2
     * sun.misc.Launcher$ExtClassLoader@60e53b93
     * null
     */
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        System.out.println(classLoader);

        while (null != classLoader) {
            classLoader = classLoader.getParent();

            System.out.println(classLoader);
        }
    }
}
