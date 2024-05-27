package week2day3;

import java.util.Arrays;
public class StudentScore {

    // static
    private static int serialIndex;
    private static int[] allScores;

    private int myIndex;
    private int score;

    public static int[] getAllScores() {
        return allScores;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        allScores[myIndex] = score;
    }

    public StudentScore(int score) {
        this.myIndex = serialIndex++;
        this.score = score;
        addAllScore(score);
    }

    private static void addAllScore(int score) {
        if(null == allScores){
            allScores=new int[] {score};
        }else{
            int length = allScores.length;
            allScores = Arrays.copyOf(allScores, length+1);
            allScores[length] = score;
        }

    }
}