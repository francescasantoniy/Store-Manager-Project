public class Crystal {
  //instance variables
  private double price;
  private String type;
  private String color;
  

  //constructors
  //no argument constructor
  public Crystal() {
this(20.0, "rose quartz", "pink");
  }

  //Paramterize
  public Crystal (double price, String type , String color) {
    this.price = price;
    this.type = type;
    this.color = color;
  }

  //accessor and mutator method
public double getPrice() {
  return price;
}
  public void setPrice(double price) {
    this.price = price;
  }
  public String getType() {
  return type;
}
  public void setType(String type) {
    this.type = type;
  }
  public String getColor() {
  return color;
}
  public void setColor(String color) {
    this.color = color;
  }
  //toString method Override
public String toString() {
  return "\nType of: " + type + "\nColor: " + color + "\nPrice: " + price;
}
  //other method
}