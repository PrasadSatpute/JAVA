public class JavaInttoString {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String string = Integer.toString(n);
            int n1 = Integer.parseInt(string);
            if(n1 >= -100 || n1 <= 100)
            {
                System.out.println("Good job");
            }
            else
                throw new Exception();
            
        } catch (Exception e) {
            System.out.println("Wrong answer");
            System.exit(0);
        }
        
    }
}
