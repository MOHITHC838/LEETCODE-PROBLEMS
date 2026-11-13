package potentialPlus.numberss;

public class alternatedigitSum {
    static void main() {

        int n = 521;
        int count = 0;
        int plusToMins=0;
        int sum = 0;

        while (n > 0){
            int last = n % 10;
            count++;
            if(count % 2 == 0){
                plusToMins = last * -1;
                sum +=plusToMins;
            }else{
                sum += last;
            }
            n = n / 10;
        }
        System.out.println(plusToMins);
        System.out.println(sum);


    }
}
