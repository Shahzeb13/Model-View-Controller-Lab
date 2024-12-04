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
