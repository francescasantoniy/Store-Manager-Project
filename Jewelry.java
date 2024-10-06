public class Jewelry extends Crystal { // Class for Jewelry
    private String material; // Material of the jewelry

  //no argument constructor
    public Jewelry() {
        super(); // Calls the Crystal no-argument constructor
        this.material = "gold"; // Main material
    }

  //Paramterize
    public Jewelry(double price, String type, String color, String material) {
        super(price, type, color); // Calling Crystal parameterized constructor
        this.material = material; // Sets the material
    }

  //accessor and mutator method
    public String getMaterial() {
        return material; // Returns the material
    }

    public void setMaterial(String material) {
        this.material = material; // Updates the material
    }

  //toString method Override
    public String toString() {
        return super.toString() + "\nMaterial: " + material; // Returns string representation
    }
}
