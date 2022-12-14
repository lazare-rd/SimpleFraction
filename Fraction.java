public class Fraction extends Number{
    private final int DENOMINATOR;
    private final int NUMERATOR; 

    public static final Fraction ZERO = new Fraction();
    public static final Fraction UN = new Fraction(1);

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
    @Override
    public String toString(){
        return this.NUMERATOR + "/" + this.DENOMINATOR ;
    }

    public int getNumerator(){
        return this.NUMERATOR;
    }

    public int getDenominator(){
        return this.DENOMINATOR;
    }

    /**
     * @return the instance in the form of a double value 
     */
    @Override
    public double doubleValue(){
        return this.NUMERATOR/this.DENOMINATOR ;
    }

    /**
     * @return the instance in the form of a float value
     */
    @Override
    public float floatValue(){
        return this.NUMERATOR/this.DENOMINATOR ;
    }

    /**
     * @return the instance in the form of a long value 
     * Be aware that if the result of the current fraction is not a natural
     * number, this method will return you the floored value.
     */
    @Override
    public long longValue(){
        return this.NUMERATOR/this.DENOMINATOR;
    }

    /**
     * @return the instance in the form of a int value 
     * Be aware that if the result of the current fraction is not a natural
     * number, this method will return you the floored value.
     */
    @Override
    public int intValue(){
        return this.NUMERATOR/this.DENOMINATOR;
    }

    /**
     * add the current instance with another instance
     * @param fraction an instance of Fraction
     * @return the reduced fraction of the sum
     */
    public Fraction add(Fraction fraction){
        int summed_numerator = this.NUMERATOR*fraction.getDenominator() 
                               + fraction.getNumerator()*this.DENOMINATOR ;
        int summed_denominator = this.DENOMINATOR*fraction.getDenominator() ;

        int pgcd = Pgcd.pgcd(summed_denominator, summed_numerator);
        Fraction summed_fraction_reduced = new Fraction(summed_numerator/pgcd, summed_denominator/pgcd);
        return summed_fraction_reduced;
    }

    /**
     * check if the instanciation is equal to another
     * @param fraction an instance of Fraction
     */
    @Override
    public boolean equals(Object other){
        if (this == other){
            return true;
        }
        if (other instanceof Fraction){
            Fraction fraction = (Fraction)other ; 
            int fraction_pgcd = Pgcd.pgcd(fraction.getDenominator(), fraction.getNumerator());
            int this_pgcd = Pgcd.pgcd(this.DENOMINATOR, this.NUMERATOR);

            if (this.getDenominator()/this_pgcd == fraction.getDenominator()/fraction_pgcd 
                && this.getNumerator()/this_pgcd == fraction.getNumerator()/fraction_pgcd)
            {
                return true;
            }
        }
        return false ;
    }

    /**
     * Gets a hashCode for the fraction.
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        return 37 * (37 * 17 + this.NUMERATOR) + this.DENOMINATOR;
    }

    /**
     * check the order relation between this instanciation and another.
     * @param fraction an instance of Fraction
     * @return -1 if the instance is strictly inferior than fraction
     *         0 if the instance is equal to fraction
     *         1 if the instance is strictly superior than fraction
     */
    public int compareTo(Fraction fraction){
        if(this.equals(fraction)){
            return 0;
        }
        else{
            if(this.doubleValue()<fraction.doubleValue()){
                return -1;
            }
            else{
                return 1;
            }
        }
    }

}