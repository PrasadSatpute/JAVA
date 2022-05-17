
package com.Examples;

abstract class Writer{
    public abstract void write();
}
class Pen extends Writer{

    @Override
    public void write() {
        System.out.println("Pen");
    }
    
}
class Pencil extends Writer{

    @Override
    public void write() {
        System.out.println("Pencil");
    }
    
}

class Book{
    public void writeSomthing(Writer p){
        p.write();
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        Book b = new Book();
        Pen p = new Pen();
        b.writeSomthing(p);
        Pencil p1 = new Pencil();
        b.writeSomthing(p1);
    }
}
