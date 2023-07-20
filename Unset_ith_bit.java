import java.util.Scanner;

public class Unset_ith_bit{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println(bitsetter(number,number2));
    }

    public static int bitsetter(int number, int number2) {
        int x=number;
        for(int i=0;i<number2;i++){
            x>>=1;
        }
        if((x&1)==1){
            return number^(1<<number2);
        }
        else{
            return number;
        }


    }

}