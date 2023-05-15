# Day 6
* Absolute path:
    - Example : 
        1. D:\SunBeam\May-2021\DAC\oopswithjava\Day6\Day_6.1\Program.java
        2. D:\SunBeam\May-2021\DAC\oopswithjava\Day6\Day_6.2\src\Program.java
    - A path of file from root directory( C:, D:, E: ) is called absolute path.
* Relative path
    - Example
        1. .\src\Program.java
    - A path of a file from current directory is called relative path.

* Consider following code
+ Day_6.1
    - Program.java
```java
class Program {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
    }
}

//javac Program.java
//java Program
```
+ Day_6.2( Compile and execute code from Day_6.2)
    - src
        >> Program.java
    - bin
        >> Program.class

```java
class Program {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
    }
}

javac 
```
* path is OS platforms environment variable which is used to locate java language tools.

* classpath is Java platform's environment variable which is used to locate   .class and .jar files.
* By default classpath is set to current directoy..
```java
set classpath=.\bin;
```