public class Main {
    public static void main(String[] args) {
        //int count = 1;
        /*while(count != 6){
            System.out.println("Count value is " + count);
            count++;
        }
        for(int i=6; i!=6; i++){
            System.out.println("count value" + count);
        }*/
        /*do {
            System.out.println("count value" + count);
            count++;
        }while(count !=6);*/
        /* count = 1;
        while(true){
            if (count == 6){
                break;
            }
            System.out.println("Count value" + count);
            count++;
        }*/
        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even Number" + number);
        }

        System.out.println(sumDigits(312));
        System.out.println(sumFirstAndLastDigit(252));
    }

    public static boolean isEvenNumber(int num) {
        if ((num % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static int sumDigits(int number){
        if(number<10){
            return -1;
        }

        int sum = 0;

        while (number > 0){
            int digit = number % 10;
            sum += digit;

            number /=10;
        }
        return sum;
    }
    public static int sumFirstAndLastDigit( int number){
        if(number < 0){
            return -1;
        }
        int lastDigit = number %10;

        while( number >= 10){
            number /= 10;
        }
        return (number + lastDigit);
    }

}