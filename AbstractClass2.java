abstract class Shape{
 public abstract double calculateArea();
  
 public void displayinfo(){
  System.out.println("This is a shape");
 }
}

class Rectangle extends Shape{
 int length;
 int breadth;
 public Rectangle(int length,int breadth){
  this.length=length;
  this.breadth=breadth;
 }
 public double calculateArea(){
  return length*breadth;
 }
}

class Circle extends Shape{
 int radius;
 public Circle(int radius){
  this.radius=radius;
 }
 public double calculateArea(){
  return Math.PI*radius*radius;
 }
}

public class AbstractClass2{
 public static void main(String args[]){
  Shape rectangle = new Rectangle(8,6);
  Shape circle = new Circle(6);
  
  System.out.println("Area of Rectangle = " + rectangle.calculateArea());
  rectangle.displayinfo();
  
  System.out.println("Area of Circle = " + circle.calculateArea());
  circle.displayinfo();     
 }
}       
