
package Perkenalan;


public class sayaaaaaa {
    public static void main(String[]args){
        int topScore = 0;
        int A = 23;
        int B = 10;
        int C = 5;
        
        // Mendapatkan nilai tertinggi
        topScore = (C > B)? C : B;
        topScore = (B > A)? B : A;
        
        // Cetak TopScore
        System.out.println("Angka 1 = " + B);
        System.out.println("Angka 2 = " + A);
        System.out.println("Angka 3 = " + C);
        System.out.println("Nilai Tertinggi : " + topScore);
    }
}
