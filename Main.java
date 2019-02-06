/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        int n;
        //int sum=0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();	 
        int sum =(n +1)*n/2;
        
        System.out.println("Sum of the Numbers is " +sum);
        

    }
}
