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
