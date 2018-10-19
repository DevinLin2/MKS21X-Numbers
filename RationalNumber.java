public class RationalNumber extends RealNumber{
  private int numerator, denominator;
  public RationalNumber(int nume, int deno){
      super(1.0);
      numerator = nume;
      denominator = deno;
      this.reduce();
      if (denominator == 0){
        numerator = 0;
        denominator = 1;
      }
  }
  public double getValue(){
    return (double)numerator / denominator;
  }
  public int getNumerator(){
    return numerator;
  }
  public int getDenominator(){
    return denominator;
  }
  public RationalNumber reciprocal(){
      RationalNumber newN = new RationalNumber(denominator,numerator);
      return newN;
  }
  public boolean equals(RationalNumber other){
    return (this.getNumerator() == other.getNumerator() && this.getDenominator()==other.getDenominator());
  }
  public String toString(){
      if (denominator == 1) {
        return "" + numerator;
      }
      if (numerator == 0) {
          return "0";
      }
      else{
          return "" + numerator + "/"+denominator;
      }
  }
  private static int gcd(int a, int b){
    int newA = a;
    int newB = b;
    while (newA != 0 && newB != 0){
      int remainder = newA % newB;
      newA = newB;
      newB = remainder;
    }
    if (newA == 0){
      return newB;
    }
    if (newB == 0){
      return newA;
    }
    return 1;
  }
  private void reduce(){
      int gcD = gcd(numerator,denominator);
      numerator = numerator / gcD;
      denominator = denominator / gcD;
  }
  public RationalNumber multiply(RationalNumber other){
    return new RationalNumber(numerator*other.numerator,denominator*other.denominator);
  }
  public RationalNumber divide(RationalNumber other){
    return this.multiply(other.reciprocal());
  }
  public RationalNumber add(RationalNumber other){
    return new RationalNumber (numerator*other.denominator+other.numerator*denominator,denominator*other.denominator);
  }
  public RationalNumber subtract(RationalNumber other){
    return new RationalNumber (numerator*other.denominator-other.numerator*denominator,denominator*other.denominator);
  }
}
