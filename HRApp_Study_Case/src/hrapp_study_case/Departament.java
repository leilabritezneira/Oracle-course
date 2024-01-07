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
public class Departament {
    
    private String name;
    private Employee[] employees = new Employee[10];
    private int lastAddedEmpoyeeIndex = -1;
    

    public Departament(String name) {
        this.name = name;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addEmp(Employee anEmployee){
        /* 
        Increment lastAddEmpoyeeIndexand add employee to this position in the employees array,
        When adding new employee to the employees array, consider the length of the array.
        You can simply stop adding extra employees once you have reach your employee array capacity. 
        */
        if(lastAddedEmpoyeeIndex < employees.length){
            lastAddedEmpoyeeIndex ++;
            employees[lastAddedEmpoyeeIndex]= anEmployee;
        }
    }
    
    public Employee[] getEmployees() {
        /*
        The idea of thisalgoriths is to return an array of employees that contains the exact
        number of elements thatmatches the actual number of employees in yhis departament.
        This can be calculated by adding one to the lastAddedEmpoyeeIndex variable.
        You then need to copy references for relevant employee object from the employees array
        to this new array and return it to the invoker.
        This way invoker always get an array that is already trimed to extract required size.
        */
        Employee[] actualEmployees = new Employee[lastAddedEmpoyeeIndex+1];
        
        for(int i = 0; i < actualEmployees.length; i++){
            actualEmployees[i] = employees[i];
        }
        return actualEmployees;
    }
    
    public int getEmployeeCount(){
        /*
        Variable lastAddedEmpoyeeIndex indicates last valid position in the employees array. 
        Because array indexing starts at zero, you need to add one to get the number of elements. 
        */
        return lastAddedEmpoyeeIndex+1;
    }  
    
    public Employee getEmployeeByID(int empId){
        /*
        You may reserve a local variable assign employee object to this variable and break out of the loop, when required employee has been located.
        Employee result = null;
        for (Employee emp; employees){
            if(emp.getID() == (empId){
                result = emp;
                break;
            }
        }
        return result;
        
        Infact, result variable will be null if no employee with matching id would be found.
        However, you may simply return required object once its found and return null if no employee with a given id has been found.
        */
        for(Employee emp: employees){
            if (emp != null) {
                if (emp.getID() == (empId)) {
                    return emp;
                }
            }
        }
        return null;
    }
    
    public double getTotalSalary(){
        /*
        Because employees array may be partitally filled with values, you need to start at 
        position zero and stop at the element indicated by the lastAddedEmpoyeeIndex variable.
        Calculate running total value and return the result.
        */
        double totalSalary = 0.0;
        for(int i = 0; i <= lastAddedEmpoyeeIndex; i++) {
            totalSalary += employees[i].getSalary();
        }
        return totalSalary;
    }
    
    public double getAverageSalary(){
        /*
        To calculate average salary you need to calculate total and divide it by the number of elements.
        (You already have a method that does total calculate). 
        You can find out the number of employees in the array by adding one to the lastAddedEmpoyeeIndex variable.
        If there are no employees in the array than you can return zero as the average does not make much sense in this case.
        */
        if(lastAddedEmpoyeeIndex > -1){
            return getTotalSalary() / (lastAddedEmpoyeeIndex+1);
        }
        return 0.0;
    }
    
    public String toString(){
        return name;
    }
}
