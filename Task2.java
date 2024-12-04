
package Model;


public class student {
    private String name;
    private String registrationNumber;
    private double gpa;

    // Constructor
    public student(String name, String registrationNumber, double gpa) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.gpa = gpa;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // ToString method for displaying student data
    @Override
    public String toString() {
        return "Name: " + name + ", Registration: " + registrationNumber + ", GPA: " + gpa;
    }
}






package Model;


public class studentModel {
    private student[] students;  

 
    public studentModel() {
        students = new student[10];  
    }

    
    public void addStudent(int index, String name, String registrationNumber, double gpa) {
        students[index] = new student(name, registrationNumber, gpa);
    }

    
    public student[] getStudents() {
        return students;
    }
}




package view;

import Model.student;
import Model.studentModel;  // Make sure to import the correct class

/**
 * View class to display student details.
 */
public class StudentView {
    public void printStudentDetails(student[] students) {
    for (int i = 0; i < students.length; i++) {
        if (students[i] != null) {  // Check if the student is not null
            System.out.println(students[i]);
        }
    }
}

}




package controller;
import Model.studentModel;
import Model.student;
import view.StudentView;



public class studentController {
    private studentModel model;
    private StudentView view;

   
    public studentController(studentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    
    public void addStudentToModel(int index, String name, String registrationNumber, double gpa) {
        model.addStudent(index, name, registrationNumber, gpa);
    }

    
    public student[] getStudentsFromModel() {
        return model.getStudents();
    }

    
  public void updateView() {
    view.printStudentDetails(model.getStudents());  
}


}




package Main;
import controller.studentController;
import Model.studentModel;
import view.StudentView;

public class Main {

   
    
    public static void main(String[] args) {
        
        studentModel model = new studentModel();
        StudentView view = new StudentView();
        studentController controller = new studentController(model, view);

        // Add 10 students to the model
        controller.addStudentToModel(0, "kamran", "073", 3.1);
        controller.addStudentToModel(1, "zauraz", "074", 2.5);
        controller.addStudentToModel(2, "Khizar", "075", 4);
        controller.addStudentToModel(3, "Ragu", "076", 2.2);
        controller.addStudentToModel(4, "kirdar", "077", 3.4);
        controller.addStudentToModel(5, "hamdan", "088", 2.8);
        controller.addStudentToModel(6, "Rahber", "085", 2.4);
        controller.addStudentToModel(7, "Qatada", "078", 3.2);
        controller.addStudentToModel(8, "Rifat", "122", 2.34);
        controller.addStudentToModel(9, "Aftab", "111", 2.66);

        
        controller.updateView();
    }
}
