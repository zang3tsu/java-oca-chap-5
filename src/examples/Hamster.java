package examples;

public class Hamster implements Walk, Run {
  public int getSpeed() {
    return 1; }
  public static void main(String[] args) {
    System.out.println(new Hamster().getSpeed()); } }
