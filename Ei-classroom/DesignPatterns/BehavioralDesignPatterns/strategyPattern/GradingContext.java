public class GradingContext {
    private GradingStrategy strategy;

    public void setGradingStrategy(GradingStrategy strategy) {
        this.strategy = strategy;
    }

    public String calculateGrade(int score) {
        return strategy.calculateGrade(score);
    }
}
