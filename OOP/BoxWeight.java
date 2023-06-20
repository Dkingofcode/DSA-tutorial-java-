package OOP;

import OOP.Inheritance.Box;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    // BoxWeight(BoxWeight other){
    //    // super(other)
    //     weight = other.weight;
    // }

   public BoxWeight(double l, double h, double w, double weight){
         super(l, h, w);
         //System.out.println("Box class constructor");
         this.weight = weight; 
         //this.l = l;
    }
}
