
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