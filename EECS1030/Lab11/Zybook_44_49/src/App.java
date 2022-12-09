import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        int startNum;

        startNum = scnr.nextInt();
        System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
        scnr.close();
    }

    public static int fibonacci(int n) {
        if(n < 2){
           switch(n){
              case 1:
                 return 1;
              case 0:
                 return 0;
              default:
                 return -1;
           }
        }
        int[] fibonacci = new int[n + 1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int i = 2; i <= n; i++){
           fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci[n];
     }
}
