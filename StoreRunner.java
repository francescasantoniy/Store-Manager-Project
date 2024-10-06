import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

Crystal C1 = new Crystal();
    Crystal C2 = new Crystal (20.0, "Tigers eye", "orange");
        Crystal C3 = new Crystal (20.0, "Citrine", "yellow");

    // Creating Jewelry objects
        Jewelry J1 = new Jewelry(90.0, "Necklace", "gold or silver", "stone (depends what crystal)");
        
        // Creating Statue objects
        Statue S1 = new Statue(50.0, "Statue", "glass", "Francesca");
        Statue S2 = new Statue(50.0, "Statue", "any color (depending on crystal)", "Francesca");



    System.out.println(C1);
    System.out.println(C2);
     System.out.println(C3);
    System.out.println(J1);

        System.out.println(S1);
        System.out.println(S2);








    // Closes the Scanner object
    input.close();
    
  }
}