class Main {
    public static void main(String[] args) {
        Fraction fraction_nulle = new Fraction() ;
        assert fraction_nulle.toString() == "0/1";

        Fraction fraction_non_nulle = new Fraction(1, 2);
        assert fraction_non_nulle.toString() == "1/2" ; 

        Fraction fraction_entiere = new Fraction(2);
        assert fraction_entiere.toString() == "2/1";
        
        System.out.println("ça compile");
    }
}