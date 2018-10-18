public class RationalNumber extends RealNumber
{
  private int numerator, denominator;
  public RationalNumber(int nume, int deno){
    super(0);
    numerator = nume;
    denominator = deno;
    if (denominator == 0){
      numerator = 0;
      denominator = 1;
    }
  }
  public double getValue(){
    return numerator / denominator;
  }
  public int getNumerator(){
    return numerator;
  }
  public int getDenominator(){
    return denominator;
  }
  public RationalNumber reciprocal(){
    return new RationalNumber(denominator,numerator);
  }
  public boolean equals(RationalNumber other){
    return this.numerator == other.numerator && this.denominator == other.denominator;
  }
  public String toString(){
    return "" + numerator + "/" + denominator;
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
    int gcd = gcd(this.numerator,this.denominator);
    numerator = numerator / gcd;
    denominator = denominator / gcd;
  }
  public RationalNumber multiply(RationalNumber other){
    return new RationalNumber(this.numerator * other.numerator,this.denominator * other.denominator);
  }
  public RationalNumber divide(RationalNumber other){
    RationalNumber reciprocal = other.reciprocal();
    return new RationalNumber(this.numerator * reciprocal.numerator,this.denominator * reciprocal.denominator);
  }
  public RationalNumber add(RationalNumber other){
    int nume1 = this.numerator * other.denominator;
    int deno1 = this.denominator * other.denominator;
    int nume2 = other.numerator * this.denominator;
    return new RationalNumber(nume1 + nume2,deno1);
  }
  public RationalNumber subtract(RationalNumber other){
    int nume1 = this.numerator * other.denominator;
    int deno1 = this.denominator * other.denominator;
    int nume2 = other.numerator * this.denominator;
    return new RationalNumber(nume1 - nume2,deno1);
  }
}
