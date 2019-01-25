package com.company;

public class Runner {
    public static String[] firstNames = {"Ashley", "Ben", "Chris", "David", "Evelyn", "Franny", "Gabe", "Hayley", "Ina", "Janet", "Kevin", "Larry"};
    public static String[] familyNames = {"Q", "W", "E", "R"};

    public static void main(String[] args) {
        Student[] students = new Student[36];
        for (int i = 0; i < students.length; i++) {
            students[i] = randomStudent();
        }

        Teacher teach = new Teacher("Math", "Ms", "A", "B");
        Classroom classRoom = new Classroom(students, teach);
        System.out.println(classRoom.printClass());
        System.out.println(classRoom.classAverage());
        classRoom.fillSeats();
        System.out.println(classRoom.getSeating());
    }
    public static Student randomStudent(){
        return new Student((double)(Math.random()*(3.0)+1), 9+(int)(Math.random()*(3)+1), (int)(Math.random()*10)+1, firstNames[(int)(Math.random() * firstNames.length)], familyNames[(int)(Math.random() * familyNames.length)]);
    }
}
