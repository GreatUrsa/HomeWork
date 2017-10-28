package lesson9.exercise2;

public class Aspirant extends Student {
    private String academicPaper;

    public Aspirant() {
    }

    public Aspirant(String firstName, String lastName, String group, String academicPaper) {
        super(firstName, lastName, group);
        this.academicPaper = academicPaper;
    }

    public String getAcademicPaper() {
        return academicPaper;
    }

    public void setAcademicPaper(String academicPaper) {
        this.academicPaper = academicPaper;
    }

    public int getScholarship() {
        return 300;
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Мария", "Иванова", "423");
        students[1] = new Student("Екатерина", "Синичкина", "423");
        students[2] = new Aspirant("Иван", "Иванов", "2", "Анализ существующих информационно-поисковых систем");
        for (Student student : students) {
            student.getScholarship();
        }
        System.out.println(students[0].getFirstName() + " " + students[0].getLastName() + " получает стипендию " + students[0].getScholarship());
        System.out.println(students[1].getFirstName() + " " + students[1].getLastName() + " получает стипендию " + students[1].getScholarship());
        System.out.println("Аспирант " + students[2].getFirstName() + " " + students[2].getLastName() + " получает стипендию " + students[2].getScholarship());
    }
}
