
package COncept;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String Name = sc.nextLine();
        float Prize = sc.nextFloat();
        int Quantity = sc.nextInt();
        
        Frute obj1 = new Frute(Name,Quantity,Prize,1);
        System.out.println("Total Cost : "+obj1.Sell());
        Frute obj2 = new Frute("Banana",3,6.0f,1);
        System.out.println("Total Cost : "+obj2.Sell());
    }
    
}
