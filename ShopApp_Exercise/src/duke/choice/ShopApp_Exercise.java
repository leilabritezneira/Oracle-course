/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

/**
 *
 * @author leilamarilinabritezneira
 */
public class ShopApp_Exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double tax = 0.2;
        double total = 0.0;

        System.out.println("Welcome to the Duke Choice Shop");

        Customer c1 = new Customer();
        c1.setName("Pinkey");
        c1.setSize("S");

        System.out.println("Customer is " + c1.getName());

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};

        item1.setDescription("Blue jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");
        
        items[2].setDescription("Green Scarf");
        items[2].setPrice(5.0);
        items[2].setSize("S");
        
        items[3].setDescription("Blue T-Shirt");
        items[3].setPrice(10.5);
        items[3].setSize("S");

        // System.out.println("Item 1 : " + item1.description + ", " + item1.price + ", " + item1.size);
        // System.out.println("Item 2 : " + item2.description + ", " + item2.price + ", " + item2.size);

        // total = (item1.price + item2.price * 2) * (1 + tax);
        // System.out.println("Total : " + total);

        int measurement = 3;

        switch (measurement) {
            case 1:
            case 2:
            case 3:
                c1.setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                c1.setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                c1.setSize("L");
                break;
            default:
                c1.setSize("X");
        }
        
        for (Clothing item: items){
            if (c1.getSize().equals(item.getSize())){
                total = total + item.getPrice(); 
                System.out.println("Item: " + item.getDescription() + ", " + item.getPrice() + ", " + item.getSize());
                
                total = total + total * tax;
                
                if (total > 15) {break;}
            }
        }
        System.out.println("Total : " + total);
    }
    
    

}
