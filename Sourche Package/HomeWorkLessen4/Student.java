package HomeWorkLessen4;

public class Student {

    int namberStudent;
    String name;
    String surname;
    int godObucheniya;
    double sredOcenkaMath;
    double sredOcenkaEconom;
    double sredOcenkaEnglis;
}

class StudentTest{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.namberStudent = 111;
        s1.name = "Даниил";
        s1.surname = "Харкин";
        s1.godObucheniya = 2024;
        s1.sredOcenkaMath = 7.9;
        s1.sredOcenkaEconom = 9.8;
        s1.sredOcenkaEnglis = 5.1;

        System.out.println("Средний балл, студента Харкина:     " +(s1.sredOcenkaMath+s1.sredOcenkaEconom+s1.sredOcenkaEnglis)/3);

        Student s2 = new Student();
        s2.namberStudent = 112;
        s2.name = "Леван";
        s2.surname = "Кения";
        s2.godObucheniya = 2024;
        s2.sredOcenkaMath = 10;
        s2.sredOcenkaEconom = 8.1;
        s2.sredOcenkaEnglis = 7.5;

        System.out.println("Средний балл, студента Кения:       " +(s2.sredOcenkaMath+s2.sredOcenkaEconom+s2.sredOcenkaEnglis)/3);

        Student s3 = new Student();
        s3.namberStudent = 113;
        s3.name = "Николай";
        s3.surname = "Боровков";
        s3.godObucheniya = 2024;
        s3.sredOcenkaMath = 8.3;
        s3.sredOcenkaEconom = 4.2;
        s3.sredOcenkaEnglis = 7.3;

        System.out.println("Средний балл, студента Боровкова:   " +(s3.sredOcenkaMath+s3.sredOcenkaEconom+s3.sredOcenkaEnglis)/3);


    }
}
