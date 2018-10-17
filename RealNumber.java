public class RealNumber{
  private double value;
  public RealNumber(double v){
    value = v;
  }
  /*
  *Return the sum of this and the other
  */
  public double add(RealNumber other){
    return value + getValue(other);
  }
  /*
  *Return the product of this and the other
  */
  public double multiply(RealNumber other){
    return value * getValue(other);
  }
  /*
  *Return the this divided by the other
  */
  public double divide(RealNumber other){
    return value / getValue(other);
  }
  /*
  *Return the this minus the other
  */
  public double subtract(RealNumber other){
    return value - getValue(other);
  }
  public double getValue(){
    return value;
  }
  public String toString(){
    return ""+value;
  }
}





