public class Grade {
    private int score;
    private char letterGrade;

    public Grade(int score) {
        this.score = score;
        this.letterGrade = calculateLetterGrade(score);
    }

    public char calculateLetterGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public boolean isPassing() {
        return score >= 60;
    }

    public String getGradeDescription() {
        switch (letterGrade) {
            case 'A': return "Excellent";
            case 'B': return "Good";
            case 'C': return "Average";
            case 'D': return "Below Average";
            case 'F': return "Failing";
            default: return "Invalid Grade";
        }
    }

    public int getScore() {
        return score;
    }

    public char getLetterGrade() {
        return letterGrade;
    }
}
