
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
