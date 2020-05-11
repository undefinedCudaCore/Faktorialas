
package faktorialas;

public class Faktorialas {
    public static int faktorialas(int a) {
        if(a == 0){
            return 1;
        }
        return a * faktorialas(a - 1);
    }

    public static void main(String[] args) {
        System.out.println(faktorialas(5));
        
        int fakt = 1;
        for (int i = 5; i >= 1 ; i--) {
            fakt *= i;
        }
        System.out.println(fakt);
    }
    
}
