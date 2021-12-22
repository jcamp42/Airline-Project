public class Airline {
  private String start;
  private String end;
  private int distance;

  /**
   * This is the constructor for the Airline Class
   * 
   * @param start    is the starting point of the airline
   * @param end      is the ending point of the airline
   * @param distance is the distance from the starting and ending airline
   */
  public Airline(String start, String end, int distance) {
    this.start = start;
    this.end = end;
    this.distance = distance;
  }

  /**
   * This method returns the starting airline
   * 
   */
  public String getStart() {
    return this.start;
  }

  /**
   * This method returns the ending airline
   * 
   */
  public String getEnd() {
    return this.end;
  }

  /**
   * This method returns the distance between the two airlines
   * 
   */
  public int getDistance() {
    return this.distance;

  }
  
  /**
   * 
   */
  public String toString() {
    return start + " --> " + end + " | Distance: " + distance;
  }
}
