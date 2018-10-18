public class RealNumber{
  private double value;
  public RealNumber(double v){
    value = v;
  }
  public double add(RealNumber other){
    return this.value + other.value;
  }
  public double multiply(RealNumber other){
    return this.value * other.value;
  }
  public double divide(RealNumber other){
    return this.value / other.value;
  }
  public double subtract(RealNumber other){
    return this.value - other.value;
  }
  public double getValue(){
    return value;
  }
  public String toString(){
    return "" + value;
  }
}
