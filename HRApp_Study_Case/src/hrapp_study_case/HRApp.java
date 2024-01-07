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
        
        System.out.println("Employee 1: " + e1);
        System.out.println("Employee 2: " + e2);
        
        Departament dept1 = new Departament("Education");
        
        dept1.addEmp(e1);
        dept1.addEmp(e2);
        dept1.addEmp(new Employee(102, "Jack", 4567));
        
        Employee[] emps = dept1.getEmployees();
        
        for(Employee emp : emps){
            System.out.println("Emp "+emp);            
        }
        
        System.out.println("Total salary: " +dept1.getTotalSalary());
        System.out.println("Average salary: " +dept1.getAverageSalary());
        
        System.out.println("Emp " + dept1.getEmployeeByID(111));


    }
    
}
