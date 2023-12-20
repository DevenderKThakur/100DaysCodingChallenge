package OOPS;

class Pen { 
    String color ;  // properties of a class 
    String type ;

    public void write(){   
        System.out.println("Writing Something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String aName , int aAge){
        this.name = aName;
        this.age = aAge;
    }
}

public class OOPS {
    public static void main(String[] args) {
        // Pen mypen = new Pen();  // Creating object in java
        // mypen.color = "Blue";
        // mypen.type = "Ball Point";

        // // mypen.write();

        // Pen mypen2 = new Pen();  
        // mypen2.color = "Red";
        // mypen2.type = "Gel";

        Student stu1 = new Student("Dev", 21);
        // stu1.name = "Dev";
        // stu1.age = 21;
        stu1.printInfo();
    }
}
