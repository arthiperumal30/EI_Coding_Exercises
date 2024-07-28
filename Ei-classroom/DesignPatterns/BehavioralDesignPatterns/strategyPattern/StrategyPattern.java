import java.util.*;

public class StrategyPattern {
    public static void main(String[] args) {
        GradingContext context = new GradingContext();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter score(0-100) : ");
        int score = scanner.nextInt();

        context.setGradingStrategy(new PercentageGrading());
        System.out.println("Grade: " + context.calculateGrade(score)); // Output: Grade: B

        context.setGradingStrategy(new LetterGrading());
        System.out.println("Grade: " + context.calculateGrade(score)); // Output: Grade: A
    }
}
