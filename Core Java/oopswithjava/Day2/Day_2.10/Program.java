import java.io.Console;

class Program{
    public static void main(String[] args) {
        Console console =  System.console();  
        System.out.print("Name  :   ");
        String name = console.readLine();
        System.out.println("Name    :   "+name);
    }
}