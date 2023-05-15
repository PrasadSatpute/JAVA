class Hello{
    public static void main( int number ){
        System.out.println(number);
    }
    public static void main( String[] args ){
        System.out.println("Hello from class Hello\n");
        Hello.main( 123 );
    }
}