import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter number : ");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
            }

        }
    }
}