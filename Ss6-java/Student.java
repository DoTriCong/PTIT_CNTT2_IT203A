public class Student {
    private String studentId;
    private String fullName;
    private int birthYear;
    private double averageScore;

    public Student(String studentId, String fullName, int birthYear, double averageScore) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.averageScore = averageScore;
    }

    public void displayInfo() {
        System.out.println("Mã SV: " + studentId);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Năm sinh: " + birthYear);
        System.out.println("Điểm TB: " + averageScore);
        System.out.println("----------------------");
    }
}
