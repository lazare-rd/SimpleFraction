class Fraction {
    private final int DENOMINATOR;
    private final int NUMERATOR; 

    public Fraction(int NUMERATOR, int DENOMINATOR){
        this.DENOMINATOR = DENOMINATOR ;
        this.NUMERATOR = NUMERATOR ;
    }

    public Fraction(int NUMERATOR){
        this.NUMERATOR = NUMERATOR ;
        this.DENOMINATOR = 1;
    }

    public Fraction(){
        this.DENOMINATOR = 1;
        this.NUMERATOR = 0;
    }

    public String toString(){
        return this.NUMERATOR + "/" + this.DENOMINATOR ;
    }

    public int getNumerator(){
        return this.NUMERATOR;
    }

    public int getDenominator(){
        return this.DENOMINATOR;
    }
}