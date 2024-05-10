package OverloadingOverridding;

/*Use the hierarchy of shape classes done already in previous assignments. Demonstrate polymorphism by calculating area and perimeter of various shapes.*/

class Shape{
    double dim1;
    double dim2;
    double area;
    double perimeter;
    public Shape(double dim1, double dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }
}
class Rectangle extends Shape{
    public Rectangle(double dim1, double dim2){
        super(dim1, dim2);
    }
    public double area(){
        area=dim1*dim2;
        return area;
    }
    public double perimeter(){
        perimeter=2*(dim1+dim2);
        return perimeter;
    }
}
class Triangle extends Shape{
    public Triangle(double dim1, double dim2){
        super(dim1, dim2);
    }
    public double area(){
        area=0.5*dim1*dim2;
        return area;
    }
    public double perimeter(){
        perimeter=2*dim1*dim2;
        return perimeter;
    }
}
public class ShapeDemo {
    public static void main(String[] args) {
        Triangle t=new Triangle(5,3);
        System.out.println(t.area());
        System.out.println(t.perimeter());
        Rectangle r=new Rectangle(5,3);
        System.out.println(r.area());
        System.out.println(r.perimeter());

    }
}
