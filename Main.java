class Main {
    public static void main(String[] args) {

        // Tests constructors
        Fraction fraction_nulle = new Fraction() ;
        assert fraction_nulle.toString() == "0/1";

        Fraction fraction_non_nulle = new Fraction(1, 2);
        assert fraction_non_nulle.toString() == "1/2" ; 

        Fraction fraction_entiere = new Fraction(2);
        assert fraction_entiere.toString() == "2/1";
        //
        // Test doubleValue
        Fraction fraction_test_conversion = new Fraction(1, 2);
        assert fraction_test_conversion.doubleValue() == 0.5;
        //
        // Test add
        Fraction fraction_test_add_1 = new Fraction(1, 2);
        Fraction fraction_test_add_2 = new Fraction(4, 4);
        Fraction added_fractions = fraction_test_add_1.add(fraction_test_add_2);
        assert added_fractions.toString() == "3/2";
        //
        // Tests equals
        Fraction fraction_test_equal_1 = new Fraction(1, 2);
        Fraction fraction_test_equal_2 = new Fraction(2, 3);
        assert fraction_test_equal_1.equals(fraction_test_equal_1) == true ;
        assert fraction_test_equal_1.equals(fraction_test_equal_2) == false ;
        //
        // Tests compareTo
        Fraction fraction_test_compareTo_1 = new Fraction(1, 2);
        Fraction fraction_test_compareTo_2 = new Fraction(1, 4);
        assert fraction_test_compareTo_1.compareTo(fraction_test_compareTo_2) == 1;
        assert fraction_test_compareTo_2.compareTo(fraction_test_compareTo_1) == -1;
        assert fraction_test_compareTo_2.compareTo(fraction_test_compareTo_2) == 0;
        //

        System.out.println("ça compile");
    }
}