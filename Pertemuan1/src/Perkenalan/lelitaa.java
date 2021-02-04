
package Perkenalan;


public class lelitaa {
    
    public static void main(String[] args){
        
        double harga =200.000;
        double diskon =0.15;
        double total;
        double potongan;
        
        potongan =diskon*harga;
        total = harga-potongan;
        
        System.out.println("harga=" +harga);
        System.out.println("diskon=" +diskon);
        System.out.println("potongan="+potongan);
        System.out.println("total bayar="+total);
    }
}
