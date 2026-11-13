package potentialPlus.numberss;

public class alternativeNumber {
    static void main() {
        int n = 521;
        String digit = n +"";
        int sum = 0;
        for(int i=0;i<digit.length();i++){

            if(i % 2 == 1){
                sum -= Integer.parseInt(digit.charAt(i) +"");

            }else{
                sum += Integer.parseInt(digit.charAt(i) +"");
            }




        }
        System.out.println(sum);

    }
}
