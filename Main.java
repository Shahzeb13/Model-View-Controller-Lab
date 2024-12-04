/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvcpatters;

/**
 *
 * @author MULTI LAPTOP
 */


public class Model {
    private String data;
    
    public String getData() {
        return data;
        
}
    
    
    public void setData(String data){
        this.data = data;
    }
    

}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvcpatters;

/**
 *
 * @author MULTI LAPTOP
 */
public class View {
    public void printData(String data){
        System.out.println("Data ;" + data);
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvcpatters;

/**
 *
 * @author MULTI LAPTOP
 */
public class Controller {
    private Model model;
    private View view;
    
    public Controller(Model model , View view){
        this.model = model;
        this.view = view;
        
    }
    
    public void setData(String data){
        model.setData(data);
    }
    
    public String getData() {
        return model.getData();
    }
    
    public void updateView(){
        view.printData(model.getData());
    }
    
}




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


