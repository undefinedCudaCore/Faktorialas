
package faktorialas;

public class Faktorialas {
    public static int faktorialas(int a) {
        if(a == 0){
            return 1;
        }
        return a * faktorialas(a - 1);
    }
    public static int faktorialas2(int a){
        int fakt = 1;
        if(a != 0){
            for (int i = a; i >= 1 ; i--) {
                fakt *= i;
            }
        } else {
            return 1;
        }
        return fakt;
    }
    public static void main(String[] args) {
        System.out.println(faktorialas(5));
        System.out.println(faktorialas2(5));
    }
    
}
