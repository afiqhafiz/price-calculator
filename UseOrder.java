 * @author afiqhafiz
 */

import java.util.Scanner;

class Order {
    String customerName;
    int customerNum;
    int quantityOrder;
    float unitPrice;
    float totalPrice;
    
    public void setName(String name) {
        this.customerName=name;
    }
    
    public void setNum(int num) {
        this.customerNum=num;
    }
    
    public void setQuantity(int qty) {
        this.quantityOrder=qty;
    }
    
    public void setUnitPrice(float price) {
        this.unitPrice=price;
    }
    
    public String getName () {
        return customerName;
    }
    
    public int getNum () {
        return customerNum;
    }
    
    public int getQuantity () {
        return quantityOrder;
    }
    
    public float getUnitPrice () {
        return unitPrice;
    }
    
    public float computePrice(){
        this.totalPrice = this.quantityOrder * this.unitPrice;
        return totalPrice;
    }
}

class ShippedOrder extends Order{
    public float computePrice(){
        totalPrice = (quantityOrder * unitPrice) + 12;
        return totalPrice;
    }
}

public class UseOrder {
    public static void main(String []args) {
        Order afiq = new ShippedOrder();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Name:");
        String name=sc.nextLine();
        System.out.println("Number:");
        int num = sc.nextInt();
        System.out.println("Quantity:");
        int qty=sc.nextInt();
        System.out.println("Price: RM");
        float price=sc.nextFloat();
        
        afiq.setName(name);
        afiq.setNum(num);
        afiq.setQuantity(qty);
        afiq.setUnitPrice(price);
        System.out.println("Total Price: RM"+afiq.computePrice());
    }
}
