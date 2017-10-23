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

    public static void main(String[] args) {
        Student first1 = new Student("Мария", "Иванова", "423");
        Student second2 = new Student("Екатерина", "Синичкина", "423");
        Aspirant first = new Aspirant("Иван", "Иванов", "2", "Анализ существующих информационно-поисковых систем");
        System.out.println("Аспирант " + first.getFirstName() + " " + first.getLastName() + " из группы " + first.getGroup() + " представляет научную работу: " + '\u0022' + first.getAcademicPaper() + '\u0022' + ".");
        System.out.println("Студентки " + first1.getFirstName() + " " + first1.getLastName() + " и " + second2.getFirstName() + " " + second2.getLastName() + " из группы " + second2.getGroup() + ".");
    }
}
