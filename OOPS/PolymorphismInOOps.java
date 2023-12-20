package OOPS;

class Student {
    String name ;
    int age ;
    // polymorphism type overloading compile time 
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name , int age){
        System.out.println(name + "" +age);
    }
}

public class PolymorphismInOOps {
    public static void main(String[] args) {
        // function overloading(compile time )  and function overriding (run-time) 
        Student s1 = new Student();
        s1.name = "Dev";
        s1.age = 21;
        s1.printInfo(s1.name , s1.age);
    }
}
