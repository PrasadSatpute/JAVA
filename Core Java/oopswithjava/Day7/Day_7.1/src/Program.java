class Program{
    public static final double PI = 3.142d;
    public static double power( double base, int index ){
        double result = 1;
        for( int count = 1; count <= index; ++ count )
            result = result * base;
        return result;
    }
    public static void main(String[] args) {
        float radius = 10.5f;
        float area =  ( float )( PI * power(radius, 2) );
        System.out.println("Area    :   "+area);
    }
    public static void main2(String[] args) {
        float radius = 10.5f;
        float area =  ( float )( Program.PI * Program.power(radius, 2) );
        System.out.println("Area    :   "+area);
    }
    public static void main1(String[] args) {
        float radius = 10.5f;
        float area =  ( float )( 3.142 * radius * radius );
        System.out.println("Area    :   "+area);
    }
}