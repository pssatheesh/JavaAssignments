package ConstructorsAssignment;

/* Write a hierarchy of geometric shape classes 'Circle', 'Rectangle', etc inherited from a common base class 'Shape'*/



class Shape{
    double base;
    double height;
    double a;
    public Shape(double base, double height){
        this.base=base;
        this.height=height;
    }
    public void Print(){
        System.out.println(a);
    }
    public void area(){ }

}
class Rectangle extends Shape{
    public Rectangle(double base, double height){
        super(base, height);
    }
    public void area(){
        a=base*height;
    }

}
class Triangle extends Shape{
    public Triangle(double base, double height){
        super(base, height);
    }
    public void area(){
        a=0.5*base*height;

    }
}
public class ShapeDemo {
    public static void main(String[] args) {
        Shape r=new Rectangle(20,15);
        r.area();
        r.Print();
        Shape t=new Triangle(6,12);
        t.area();
        t.Print();
    }
}
