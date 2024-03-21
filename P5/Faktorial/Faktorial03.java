package P5.Faktorial;

public class Faktorial03 {
    public int nilai;

    int faktorialBF(int n) {
        if (n == 0 || n ==1) {
            return 1;
        }else {
            int fakto = n * faktorialBF(n - 1);
            return fakto;
        }
    }

    int faktorialDC (int n){
        if (n == 1) {
            return 1;
        }
        else{
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}
