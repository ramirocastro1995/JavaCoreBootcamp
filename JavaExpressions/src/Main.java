public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score,levelCompleted,bonus);
        System.out.println("puntaje final es " + highScore);
        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score,levelCompleted,bonus);
        System.out.println("puntaje final es " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim",highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("b",highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("c",highScorePosition);

        highScorePosition = calculateHighScorePosition(80);
        displayHighScorePosition("d",highScorePosition);

        highScorePosition = calculateHighScorePosition(1200);
        displayHighScorePosition("g",highScorePosition);


    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver){
            int finalScore = score +(levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }else{
            return -1;
        }

    }

    public static void displayHighScorePosition(String playerName,int highScorePosition){
        System.out.println(playerName + " managed to get into position"
            + highScorePosition + "on the high score table");

    }
    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000){
            return 1;
        }else if(playerScore >= 500) {
            return 2;
        }else if (playerScore >= 100){
            return 3;
        }
        return 4;

    }

}