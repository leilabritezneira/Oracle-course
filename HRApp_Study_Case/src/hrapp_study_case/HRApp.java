/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrapp_study_case;

/**
 *
 * @author leilamarilinabritezneira
 */
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HR App Starts");
        
        Employee e1 = new Employee (100, "Tom", 1234);
        
        Employee e2 = new Employee (101, "Matt", 9876.9);
        
        System.out.println("Emplyee: " + e1);
        System.out.println("Emplyee: " + e2);
    }
    
}
