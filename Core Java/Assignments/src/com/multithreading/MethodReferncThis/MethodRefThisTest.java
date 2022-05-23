
package com.multithreading.MethodReferncThis;

public class MethodRefThisTest {
   public void runBody() {
      for(int i = 1; i < 10; i++) {
         System.out.println("Square of " + i + " is: " + (i*i));
      }
   }
   public static void main(String[] args) {
      MethodRefThisTest test = new MethodRefThisTest();
      test.createThread();
   }
   private void createThread() {
      new Thread(this::runBody).start();   // method reference
   }
}