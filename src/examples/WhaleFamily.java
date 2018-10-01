package examples;

public interface WhaleFamily extends HasFins {
  public default int getNumberOfFins() {
    return 8; }
  public double getLongestFinLength();
//  public boolean doFinsHaveScales() {
//    return false; } 
  }
