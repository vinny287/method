public class StudentGrader {

    public static String calculateGrade(int score) {
        // проверяем что оценка от 0 до 100
        if (score < 0 || score > 100) {
            return "Invalid score";
        }

        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        System.out.println(calculateGrade(95));   // A
        System.out.println(calculateGrade(83));   // B
        System.out.println(calculateGrade(70));   // C
        System.out.println(calculateGrade(61));   // D
        System.out.println(calculateGrade(30));   // F
        System.out.println(calculateGrade(150));  // Invalid score
        System.out.println(calculateGrade(-5));   // Invalid score
    }
}