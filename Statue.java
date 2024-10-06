public class Statue extends Crystal{
  private String artist;

  // no argument constructor 
  public Statue() {
    super();
    this.artist = "Francesca";
  }
  //Paramterize
  public Statue(double price, String type, String color, String artist){
    super(price,type,color);
    this.artist = artist;
  }
  //accesor and mutator method 
  public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
  //toString method Override
public String toString() {
        return super.toString() + "\nArtist: " + artist;
    }
  
}