package examples;

public interface HasFins {
  public default int getNumberOfFins() {
    return 4; }
  public default double getLongestFinLength() {
    return 20.0; }
  public default boolean doFinsHaveScales() {
    return true; }
//  private default String getShape() {
//    return "Elongated"; }
//  protected default void print() {
//    System.out.println("Number of fins: " + getNumberOfFins());
//  } 
  }
