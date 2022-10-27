public class Main {
    public static void main(String[] args) {
        int value = 1;
        if (value == 1){
            System.out.println("Value was 1");
        }else if(value ==2){
            System.out.println("Value was 2");
        }else{
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 3;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4:case 5:
                System.out.println("was a 3,or a 4,or a 5");
                System.out.println("Actually it was a"+switchValue);
                break;

            default:
                System.out.println("was not 1 or 2");
                break;
        }

        char caracter = 'Z';

        switch(caracter){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("b was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(caracter + " was found");
                break;
            default:
                System.out.println("Could not found");
                break;
        }
        String month = "january";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
            case "june":
                System.out.println("Jun");
            default:
                System.out.println("Not sure");
        }
    }

    public static void printDayOfTheWeek(int day){
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
        }

    }
}