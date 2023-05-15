class Program{
    public static void main(String[] args){
        int number; //Method Local Variable
        number = 123;
        System.out.println( "Number     :   "+ number );   //OK
    }
    public static void main3(String[] args){
        int number; //Method Local Variable
        number = 123;
        System.out.println( number );   //OK
    }
    public static void main2(String[] args){
        int number = 123; //Method Local Variable
        System.out.println( number );   //OK
    }
    public static void main1(String[] args){
        //int number; //Method Local Variable
        //System.out.println( number );   //error
    }
}