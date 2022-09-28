import java.util.Scanner;
 
/**
 * Guess the number (Mini Project)
 */
public class practice {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int)(Math.random()*100);
        int guess = 0;
 
        do{
            System.out.println("Guess the number: ");
            guess = sc.nextInt();
 
            if(guess==number){
                System.out.println("Yes! You Got the number");
                break;
            }
            else if(guess>number){
                System.out.println("Number is larger");
            }
            else{
                System.out.println("Number is Smaller");
            }
        }while(guess>=0);
        sc.close();
    }
}
