package examples.lemur;

public class Lemur extends Primate implements HasTail {
  public boolean isTailStriped() { return false; }
  public int age = 10;
  public static void main(String[] args) {
    Lemur lemur = new Lemur();
    System.out.print(lemur.age + " ");
    HasTail hasTail = lemur;
    System.out.print(hasTail.isTailStriped()  + " ");
//    System.out.println(hasTail.age);
    Primate primate = lemur;
//    System.out.println(primate.isTailStriped());
    System.out.print(primate.hasHair()); 
//    Lemur lemur2 = primate; // DOES NOT COMPILE
    Lemur lemur3 = (Lemur)primate;
    System.out.println(lemur3.age); } }
