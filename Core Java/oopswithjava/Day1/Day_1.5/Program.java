import java.util.ArrayList;

class Program{
    public static void main(String[] args){
        System.out.println( ArrayList.class.getClassLoader());
        System.out.println( ClassLoader.getPlatformClassLoader());
        System.out.println( ClassLoader.getSystemClassLoader());
    }
}