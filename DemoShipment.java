class Box{
 private double width;
 private double height;
 private double depth;
 
 Box(double w,double h,double d){
  this.width=w;
  this.height=h;
  this.depth=d;
 }
 
 double volume(){
  return width*height*depth;
 }
}


class BoxWeight extends Box{
 double weight;
 BoxWeight(double w,double h,double d,double m){
  super(w,h,d);
  this.weight=m;
 }
}


class Shipment extends BoxWeight{
 double cost;
 Shipment(double w,double h,double d, double m, double c){
  super(w,h,d,m);
  this.cost=c;
 }
}

     
class DemoShipment{
 public static void main(String args[]){
  Shipment Shipment1 = new Shipment(10,20,15,50,3000.50);
  double vol;
  
  vol=Shipment1.volume();
  
  System.out.println("Volume of Shipment 1 is " + vol);
  System.out.println("Weight of Shipment 1 is " + Shipment1.weight);
  System.out.println("Shipping Cost: " + Shipment1.cost);
 }
}      
