package P5.Faktorial;

public class Faktorial03 {
    int nilai;

    int faktorialBF(int n) {
        int fakto;
        for(int i=0; i <=n; i++){
            fakto = fakto * 1;
        }
        return fakto;

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
