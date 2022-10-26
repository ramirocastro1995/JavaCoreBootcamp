public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim",500);
        System.out.println("New Score is" + newScore);
        calculateScore("Ramiro",12);
        calculateScore(12);
        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(6,0));
        System.out.println(getDurationString(65,45));

    }
    public static int calculateScore(String playerName,int score) {
        System.out.println("Player scored "+ playerName + score + "points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Player scored " + score + "points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No player,no score");
        return 0;
    }

    public static int calcFeetAndInchesToCentimeters(double feet, double inches) {
        if((feet >= 0) || ((inches <0) && (inches > 12))){
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "feet ," + inches + "inches" + centimeters + "cm");
        return (int) centimeters;
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || (seconds < 0 || seconds > 59)){
            return "invalid value";
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
    public static String getDurationString(long seconds){
        if(seconds < 0) {
            return "invalid value";
        }
        long minutes = seconds / 60;
        long remaindSeconds = seconds  % 60;

        return getDurationString(minutes,seconds);
        }

    }

}