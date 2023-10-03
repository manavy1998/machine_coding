/*
 * Shapes impliment
 * to show inheritance and poly when creating shapes. Specially to see Square - Rectangle, Circle, Elips relationships.
 */
import java.util.Scanner;

interface Shape{
    double parameter();
    double area();
}

interface Quadrilateral extends Shape{
    void setSides();
    //void setAngles();
}

interface Triangle extends Shape{
    void setSides();
    void setAngles();
}

class Circle implements Shape{

    private int radius;

    public Circle(){
        System.out.print("Please enter the radius of the circle: ");
        Scanner scanner = new Scanner(System.in);
        this.radius = scanner.nextInt();
        scanner.close();
    }

    @Override
    public double parameter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }
    
}

class Rectangle implements Quadrilateral {
    
    private int len;
    private int wid;

    public Rectangle(){
        setSides();
        return;
    }

    @Override
    public void setSides(){
        System.out.println("Please enter the sides of the rectangle - ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        this.len = scanner.nextInt();
        System.out.print("Width: ");
        this.wid = scanner.nextInt();
        scanner.close();
    }

    @Override
    public double parameter(){
        return (2 * len) + (2 * wid);
    }
    
    @Override
    public double area(){
        return len * wid;
    }
}




public class Main{
    public static void main(String args[]){
        Shape shape = new Circle();
        System.out.println(shape.parameter());
    }
 }