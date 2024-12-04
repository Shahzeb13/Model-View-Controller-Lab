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
