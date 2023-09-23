import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Guess The Number");
        int range = 10;
        int number = (int) (Math.random() * range);

        while (true){
            System.out.println("Guess The Number From 0 to " + range);
            int input_number = sc.nextInt();
            if(input_number == number){
                System.out.println("You Guessed");
                break;
            }else if(input_number > number){
                System.out.println("The Hidden Number is Less");
            }else {
                System.out.println("The Hidden Number is Greater");
            }

        }
        sc.close();
    }
}
