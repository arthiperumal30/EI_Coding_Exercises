public class LetterGrading implements GradingStrategy {
    @Override
    public String calculateGrade(int score) {
        if (score >= 85) return "A";
        else if (score >= 70) return "B";
        else if (score >= 50) return "C";
        else if (score >= 35) return "D";
        else return "F";
    }
}
