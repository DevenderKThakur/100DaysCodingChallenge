package OOPS;

class Shape{  //Parent class 
    public void area(){
        System.out.println("display Area");
    }
}

class Triangle extends Shape{  // Child Class Single base inheritance
    public void area(int len , int h){
        System.out.println(1/2*len*h);
    }
}

class equiTriangle extends Triangle{  // Multi-level Inheritance 
    public void area(int len , int h){
        System.out.println(1/2*len*h); 
    }
}

class Circle extends Shape {  // Heirarchial Inheritance 
    public void area(int rad){
        System.out.println((3.14)*rad*rad);
    }
}

public class InheritanceOOP {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
         
    }
}
