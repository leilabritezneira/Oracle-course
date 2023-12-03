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

        Customer c1 = new Customer("Pinkey", 3);
        
        //c1.setName("Pinkey");
        //c1.setSize("S");

        System.out.println("Min price" + Clothing.MIN_PRICE);
        
        Clothing item1 = new Clothing("Blue jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5.0, "S"), new Clothing("Blue T-Shirt", 10.5, "S")};

        /*
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
        */
        
        // System.out.println("Item 1 : " + item1.description + ", " + item1.price + ", " + item1.size);
        // System.out.println("Item 2 : " + item2.description + ", " + item2.price + ", " + item2.size);

        // total = (item1.price + item2.price * 2) * (1 + tax);
        // System.out.println("Total : " + total);

        int measurement = 8;
        
        c1.addItems(items);
        
        //c1.setSize(measurement);
        
        //System.out.println("Customer is " + c1.getName() + ", " + c1.getSize());
        System.out.println("Customer is " + c1.getName() + ", " + c1.getSize() + ", " + c1.getTotalClothingCost());

        /*
        for (Clothing item: items){
            if (c1.getSize().equals(item.getSize())){
                total = total + item.getPrice(); 
                System.out.println("Item: " + item.getDescription() + ", " + item.getPrice() + ", " + item.getSize());
                total = total + total * tax;
                if (total > 15) {break;}
            }
        }
        */
        //System.out.println("Total : " + total);
        for (Clothing item: c1.getItems()){ 
            System.out.println("Items : " + item.getDescription());
        }
    }
    
    

}
