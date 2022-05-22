
package com.String;

class TestStrings
{
    void stringToint(int i, String s){
        String string = String.valueOf(i);
        boolean b = false;
        if(i == Integer.parseInt(s)){
            b=true;
        }
        System.out.println(b);
    }
    static {
        System.out.println("Static Block");
    }
}

public class StringExample {
    public static void main(String[] args) throws Exception {
//        TestStrings t = new TestStrings();
//        t.stringToint(10, "10");

        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println("Please Dont Do that");
            e.printStackTrace();
            throw new Exception("Dont Do Like That");
        }
        
        System.out.println("Run ");
    }
    
}
