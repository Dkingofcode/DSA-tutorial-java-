package OOP.staticExample;

public class Instance {
   public static void main(String[] args) {
      Human kunal = new Human(22, "Kunal", 10000, true);
      Human rahul = new Human(23, "Harry", 209859, false);

      System.out.println(kunal.name);
   }    
}
