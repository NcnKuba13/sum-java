package SUMof1SEQ;
import java.util.*;

public class Fuente {

    public static void main(String[] args) {
        long bk, n, S;
        bk = 1;
        
        for(int r = 1; r <= bk; r++) {
            Scanner inA = new Scanner(System.in);
            
            try {
                System.out.printf("Podaj n: ");
                n = inA.nextLong();
                if(n <= 1 || n >= 10000) throw new Exception();
                
                System.out.printf("Podaj S: ");
                S = inA.nextLong();
                if(Math.abs(S) >= 50000000) throw new Exception();
                System.out.println("Ciąg: ");
                        
                Sequence activ = new Sequence();
                activ.ciag(n, S);
            }
            catch (Exception e){
                System.out.println("Parametr ma błędną wartość!");
            }
        }
    }
    
}
