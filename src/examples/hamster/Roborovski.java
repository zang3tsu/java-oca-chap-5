package examples.hamster;

public class Roborovski extends Hamster {
  public static void main(String[] args) {
    Roborovski hamster = new Roborovski();
    Hamster newHamster = hamster;
//    Roborovski anotherHamster = newHamster;
    Roborovski anotherHamster = (Roborovski) newHamster;

    Hamster syrian = new Hamster();
    if (syrian instanceof Roborovski) {
      Roborovski robo = (Roborovski) syrian;
    }

//    Rat rat = (Rat) hamster;
  }
}
