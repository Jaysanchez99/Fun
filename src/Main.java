import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        int num1, num2;
        String operation;
        System.out.println("Welcome to the calculator app.");
        while(true){
            try{
                System.out.print("Enter your first number: ");
                num1 = Keyboard.nextInt();
                System.out.print("Enter an Operation: ");
                operation = Keyboard.next();
                System.out.print("Enter your second number: ");
                num2 = Keyboard.nextInt();
                System.out.println(functions.Calculator(num1, operation, num2));
                System.out.print("Do you want to try again?(Y/N): ");
                String res = Keyboard.next();
                if(res.equals("N") || res.equals("n")){
                    break;
                }else{
                    System.out.println("Clearing...");
                }
            }catch(Exception e){
                System.out.println("This is not a valid option. Please try again.");
            }
        }
    }
}