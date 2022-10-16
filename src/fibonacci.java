import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n1 = 0,n2 = 1, length , i;
        System.out.print("fibonacci serisinin istenilen uzunluğunu giriniz:");
        length = inp.nextInt();

        for(i=0; i<length; i++){
            if(i % 2 == 0){
                System.out.println(n1 + " ");
                n1 += n2;
            }
            else{
                System.out.println(n2 + " ");
                n2 += n1;
            }
        }
    }
}
