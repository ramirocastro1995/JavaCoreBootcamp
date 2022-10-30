public class Main {
    public static void main(String[] args) {
        String numberAsString = "2018.125";
        System.out.println("NumberAsString = " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number=" + number);
        System.out.println(canPack(1, 0, 4));
    }
    public static boolean canPack(int bigCount,int smallCount, int goal){
        int sumOfKilos = 0;
        bigCount *= 5;
        sumOfKilos = bigCount + smallCount;

        if(bigCount < 0 || smallCount <0 || goal <0 || sumOfKilos < goal){
            return false;
        }else if(sumOfKilos == goal){
            return true;
        }
        if(smallCount == 0){
            if(bigCount % goal == 0){
                return true;
            }else{
                return false;
            }
        }
        else{
            if(bigCount > goal && bigCount % goal !=0){
                return true;
            }else{
                return false;
            }
        }
    }
}