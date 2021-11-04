package ro.fasttrackit.curs8.homework4;

public class StudentMain {
    public static void main(String[] args) {
        StudentGrade studentGrade = new StudentGrade("John", 10);
        StudentGrade studentGrade1 = new StudentGrade("Mary", 9);
        StudentGrade studentGrade2 = new StudentGrade("Dan", 11);

        System.out.println(studentGrade.getName() + " take grade " + studentGrade.getGrade());
        System.out.println(studentGrade1.getName() + " take grade " + studentGrade1.getGrade());
        System.out.println(studentGrade2.getName() + " take grade " + studentGrade2.getGrade());

        System.out.println("Students average grade " + StudentGrade.averageGrade());

    }
}
