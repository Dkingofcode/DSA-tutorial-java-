package OOP;

public class Inheritance {
   
   
   public class Box {
    double l;
    double h;
     double w;
   }

   private double l;
   private double h;
   private double w;

   Inheritance() {
      this.h = -1;
      this.l = -1;
      this.w = -1;
   }
 
   Inheritance(double side) {
      // super(); Object class

      this.w = side;
      this.l = side;
      this.h = side;
   }
  
   Inheritance(double l, double h, double w){
      System.out.println("Box class constructed");
      this.l = l;
      this.h = h;
      this.w = w;
   }

   Inheritance (Box old){
      this.h = old.h;
      this.l = old.l;
      this.w = old.w;
   }

   public void information() {
      System.out.println("Running the box");
   }

   // public class BoxWeight extends Box{
   //   double weight;

   //  //  public Boxweight(){
   //  //     this.weight = -1;
   //  //  }

   //   public BoxWeight(double l, double h, double w,  double weight) {
   //      this.weight = -1;
   //   }
  // } 
}
