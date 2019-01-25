package com.company;

public class Classroom {
    private Student[] studentList;
    private Teacher teacher;
    private Student[][] seatingChart = new Student[6][6];
    public Classroom(Student[] students, Teacher teacher){
        this.studentList = students;
        this.teacher = teacher;
    }
    public String getSubject(){
        return teacher.getSubject();
    }
    public double classAverage(){
        double totalAvg = 0;
        for(Student s : studentList){
            totalAvg += s.getGPA();
        }
        return totalAvg / 34;
    }

    public String printClass(){
        String output = "";
        output += "Teacher: " + teacher.toString() + ", Subject: " + teacher.getSubject() + ", Students:";
        for(Student s : studentList){
            output += " " + s.toString() + ",";
        }
        return output;
    }
    public void fillSeats(){
        int counter = 0;
        for(int i = 0; i < seatingChart.length; i++){
            for(int j = 0; j < seatingChart[i].length; j++){
                seatingChart[i][j] = studentList[counter];
                        counter++;
            }
        }
    }
    public String getSeating(){
        String output = "";
        for(int i = 0; i < seatingChart.length; i++){
            output += "Row " + (i+1) + ": ";
            for(int j = 0; j < seatingChart[i].length; j++){
                output += "Seat " + (j+1) + ": " + seatingChart[i][j].toString() + ", ";
            }
            output += "\n";
        }
        return output;
    }
}
