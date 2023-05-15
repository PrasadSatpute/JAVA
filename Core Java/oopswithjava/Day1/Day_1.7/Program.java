class Program{
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);

        float num2 = Float.parseFloat( args[1]);

        double num3 = Double.parseDouble( args[2]);

        double result = num1 + num2 + num3;
        System.out.println("Result   :   "+result);
    }

    public static void main2(String[] args){
        //int num1 = args[ 0 ];   //Not OK
        int num1 = Integer.parseInt( args[ 0 ] );   //OK

        //int num2 = args[ 1 ];   //Not OK
        int num2 = Integer.parseInt( args[ 1 ]);   //Not OK
        
        int result = num1 + num2;
        System.out.println("Result   :   "+result);
    }

    public static void main1(String[] args){
       int num1 = 10;
       int num2 = 20;
       int result = num1 + num2;
       System.out.println("Result   :   "+result);
    }
}