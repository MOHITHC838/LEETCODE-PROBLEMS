package potentialPlus.numberss;

public class bankDigit {
    static void main() {
        int n = 9875;
        int sums =0;
        while(n > 10){
            int sum = 0;
            while(n > 0){
                int last = n % 10;
                sum += last;
                n = n / 10;
            }
            n=sum;
            sums = sum;
        }
        System.out.println(sums);


    }
}
