
package com.Examples;

//class Other{
//    void call(){
//        System.out.println("Other class Call");
//    }
//    void call1(){
//        System.out.println("Other class Call");
//    }
//}
//
//public class AnonymousInnerClass {
//    public static void main(String[] args) {
//        Other o = new Other();
//        o.call();
//    }
//}

//-----------------------------------------------------------------------

//class Other{
//    void call(){
//        System.out.println("Other class Call");
//    }
//    void call1(){
//        System.out.println("Other class Call");
//    }
//}
//
//public class AnonymousInnerClass {
//
//    public static void main(String[] args) {
//        Other o = new Other() {
//            void call1() {
//                System.out.println("Anonymous class Call");
//            }
//        };
//        o.call();
//        o.call1();
//    }
//}

//-----------------------------------------------------------------------

//class Other{
//    void call(){
//        System.out.println("Other class Call");
//    }
//    void call1(){
//        System.out.println("Other class Call");
//    }
//}
//
//public class AnonymousInnerClass {
//
//    public static void main(String[] args) {
//        new Other() {
//            void call1() {
//                System.out.println("Anonymous class Call");
//            }
//        }.call1();
//    }
//}

//-----------------------------------------------------------------------
//Anonymous classes usually extend subclasses or implement interfaces.

//interface Other{
//    void call();
//}

//public class AnonymousInnerClass {
//    public static void main(String[] args) {
//        Other o = new Other(){
//            public void call(){
//                System.out.println("Anonymous Call");
//            }
//        };
//        o.call();
//    }
//}

//-----------------------------------------------------------------------

//interface Other{
//    void call();
//    void add(int a ,int b);
//    int sub(int x, int y);
//}
//
//public class AnonymousInnerClass {
//    public static void main(String[] args) {
//        new Other(){
//            @Override
//            public void call() {
//                System.out.println("Anonymous Call");
//            }
//
//            @Override
//            public void add(int a, int b) {
//                System.out.println(a+" + "+b+" = "+ (a+b));
//            }
//
//            @Override
//            public int sub(int x, int y) {
//                return x-y;
//            }
//            
//        }.call();
//    }
//}

//-----------------------------------------------------------------------

//interface Other{
//    int sub(int x, int y);
//}
//
//public class AnonymousInnerClass {
//    public static void main(String[] args) {
//        System.out.println(new Other(){
//            @Override
//            public int sub(int x, int y) {
//                return x-y;
//            }
//            
//        }.sub(20, 10));
//    }
//}

//-----------------------------------------------------------------------


//public class AnonymousInnerClass {
//    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Anonymous Class with Thread");
//            }
//        }).start();
//        
//        new Thread() {
//         public void run() {
//            for (int i=1; i <= 5; i++) {
//               System.out.println("Anonymous class method: " + i);
//            }
//         }
//      }.start();
//    }
//}

//  --------------------------------------------------------

class Employee{
    void PrintDesgn(String name,String desig){
        System.out.println("Name : "+name+" Designation "+desig);
    }
}

public class AnonymousInnerClass {

    public static void main(String[] args) {
        
        Employee prasad = new Employee();
        prasad.PrintDesgn("Prasad","Associate Consultant");
        
        Employee mahesh = new Employee();
        mahesh.PrintDesgn("Mahesh","Associate Consultant");
        
        Employee ishan = new Employee();
        ishan.PrintDesgn("Ishan","Associate Consultant");
        
        Employee Ramesh = new Employee(){
            @Override
            void PrintDesgn(String name,String desig) {
                System.out.println("----------------------------------------------");
                System.out.println("Manager of All above Employees");
                System.out.println("Name : "+name+" Designation "+desig);
                System.out.println("----------------------------------------------");
            }
        };
        Ramesh.PrintDesgn("Ramesh","Java Architect");
    }
}