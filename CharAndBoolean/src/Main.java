public class Main {
    public static void main(String[] args) {
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
        String myString = "This is a string";
        System.out.println("myString is equal to" + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to" + myString);
        myString = myString + "2019";
        System.out.println("myString is equal to" + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to" + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to" + lastString);
        //Operators
        int result = 1 + 2; //1+2=3
        System.out.println("1+2 =" + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3-1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; //2 * 10 = 20
        System.out.println("2*10 = " + result);

        result = result / 5; // 20/5=4
        System.out.println("20 / 5 =" + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 =" + result);

        // result = result + 1;
        result++; // 1+1 = 2
        System.out.println("1+1 =" + result);

        result--; // 1+1 = 2
        System.out.println("2-1 =" + result);

        //result = result +2;
        result += 2; // 1+2=3
        System.out.println("1+2 =" + result);

        //result = result * 10;
        result *= 10; // 3*10 = 30
        System.out.println("3 * 10 =" + result);

        //result = result / 10;
        result /= 3; // 30/3 = 10
        System.out.println("30/3 =" + result);
        //condicionales

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("it is not an alien!");
            System.out.println("im afraid");
        }

        int topScore = 80;
        if (topScore != 100) {
            System.out.println("high score!");
        }
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100!");
        }
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Greater than second top score and less than 100!");
        }

    }
}


