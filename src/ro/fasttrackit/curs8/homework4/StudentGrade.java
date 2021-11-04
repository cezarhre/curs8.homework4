package ro.fasttrackit.curs8.homework4;

public class StudentGrade {

    private final String name;
    private final int grade;
    static double gradeSum = 0;
    static double nrStudents = 0;

    public StudentGrade(String name, int grade) {
        this.name = name;
        this.grade = (grade>1 && grade <=10) ? grade :1;
        gradeSum = gradeSum + this.grade;
        nrStudents++;

    }

    public String getName() {
        return name;
    }

    public int getGrade() {
          return grade;
        }

    public static double averageGrade() {
        return Math.round(gradeSum / nrStudents);
    }
}
