/*
Mouner Dabjan   
Oct 3
To calculate the bill for someone going shopping 
 */

package shopping;
import java.util.Scanner; 
/**
 *
 * @author modab5310
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //constants
        final double TAX_RATE = 0.13;
        final double USB_PRICE = 19.99;
        final double KEYBOARD_PRICE = 49.99;
        final double MOUSE_PRICE = 25.99; 
        
        Scanner keyboard = new Scanner(System.in); 
        
        //variables 
        
        double USB;
        double keynum; 
        double mouse; 
        double grandtotal; 
        double subtotal;
        double taxtotal; 
        
       
        //input
        System.out.println("Please enter the number of USBs you want to purchase:");
        USB = keyboard.nextDouble(); 
        
        System.out.println("Please enter then number of keyboards you want to purchase"); 
        keynum = keyboard.nextDouble(); 
        
        System.out.println("Please enter the number of mice you want to purchase");
        mouse = keyboard.nextDouble(); 
        
        
        //algorithms 
        
        subtotal = (USB * USB_PRICE ) + (keynum * KEYBOARD_PRICE ) + (mouse * MOUSE_PRICE); 
        taxtotal = subtotal * TAX_RATE; 
        grandtotal= subtotal + taxtotal; 
        
        
        //output
        
        System.out.println("Your grandtotal is " + grandtotal + "$" + "."); 
        
        
      
        
                
                
              
       
        
        
    
    }
    
}
