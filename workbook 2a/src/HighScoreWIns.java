import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWIns {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- HighScoreWins ---");

        System.out.println("Please enter a game score: (format team1:team2|score1:score2)");
        String scoreboard = scanner.nextLine();

        String[] splice = scoreboard.split(Pattern.quote("|"));
        String[] teams = splice[0].split(Pattern.quote(":"));
        String[] score = splice[1].split(Pattern.quote(":"));

        int score1 = Integer.parseInt(score[0]);
        int score2 = Integer.parseInt(score[1]);

        if (score1 > score2) {
            System.out.println("Winner: " + teams[0]);
        } else if (score2 > score1) {
            System.out.println("Winner: " + teams[1]);
        } else {
            System.out.println("Tie");
        }

        scanner.close();
    }
}
