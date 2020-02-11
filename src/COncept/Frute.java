
package COncept;

public class Frute extends constructor{
    String Name;
    int Quantity;
    float Prize;
    
    public Frute(String a,int b,float c,int n){
        super(n);
        Name = a;
        Quantity = b;
        Prize = c;
    }
    
    float Sell(){
        return Quantity*Prize;
    }
}
