package potentialPlus.numberss;

public class amstrong {

    public static void amstrong(int n){
        int sum =0;
        int temp = n;
        if(n < 10){
            System.out.println("These are amstrong no (1 to 500): " +n);
        }else{
            while(n > 0){
                int last = n % 10;
                sum += last * last *last;
                n = n / 10;
            }
        }

        if(temp == sum){
            System.out.println("These are amstrong no (1 to 500): " +sum);

        }
    }

    static void main() {
        int n = 500;
        for(int i=1;i<=500;i++){
            amstrong(i);
        }
    }


}
