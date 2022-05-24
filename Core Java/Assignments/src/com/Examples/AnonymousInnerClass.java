
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

class Other{
    void call(){
        System.out.println("Other class Call");
    }
    void call1(){
        System.out.println("Other class Call");
    }
}

public class AnonymousInnerClass {

    public static void main(String[] args) {
        Other o = new Other() {
            void call1() {
                System.out.println("Anonymous class Call");
            }
        };
        o.call();
        o.call1();
    }
}

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
//        Other o = new Other(){
//            @Override
//            public void call() {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public void add(int a, int b) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public int sub(int x, int y) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//            
//        };
//    }
//}