public class Pgcd {

    /** Renvoie de pgcd de deux entiers.
   * @param a un entier 
   * @param b l'autre entier */

    public static int pgcd(int a,int b) {
        int r = a;
        while (r!=0)  {r = a%b; a=b; b=r; }
        return(Math.abs(a));
        }
}
