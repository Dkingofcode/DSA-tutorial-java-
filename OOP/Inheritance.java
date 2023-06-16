package OOP;

public class Inheritance {
   public static void main(String[] args) {
    
   }
   
   public class Box {
    double l;
    double h;
     double w;
   }





   public class BoxWeight extends Box{
     double weight;

    //  public Boxweight(){
    //     this.weight = -1;
    //  }

     public BoxWeight(double l, double h, double w,  double weight) {
        this.weight = -1;
     }
   } 
}
