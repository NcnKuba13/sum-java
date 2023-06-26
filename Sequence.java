package SUMof1SEQ;

public class Sequence {
    public void ciag (long n, long S) {
        if((Math.abs(S)) % 2 != (n * (n - 1) / 2) % 2 || S > n * (n - 1) / 2 || S < -n * (n - 1) / 2) {
            System.out.printf("Nie istnieje.\n");
            return;
        }
       
        System.out.printf("0\n");
        int a = 0;
       
        for(long i = n - 1; i > 0; i--) {
            if(S + i <= i * (i - 1) / 2) {
                a--;
                S = S + i;
        }
            else {
                a++;
                S = S - i;
        }
        
            System.out.printf("%d\n", a);
        }
        
    }
}
