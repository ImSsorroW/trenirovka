package trenirovka5;

public class Student {
    String name;
    int grade;

    public Student (String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    public boolean isExcellent() {
        if (this.grade >=10) {
            return true;
        } else {
            return false;
        }
    }
    public void printInfo() {
        System.out.println("Студент: " + this.name + " Оценка: " + this.grade + " Отличник: " + isExcellent());
    }
}
