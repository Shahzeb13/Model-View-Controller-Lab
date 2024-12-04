

package com.mycompany.mvcpatters;


public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        
        Controller controller = new Controller(model , view);
        
        
        controller.setData("Hello! Model View Controller");
        controller.updateView();
            
    }
}
