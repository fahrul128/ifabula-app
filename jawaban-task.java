// 1
public class AngkaRandom {
 
 public static void main( String args[] ){
 
 /** Generator angka random */
 Random angkaRandom = new Random(); 
 
 /** Menyimpan setiap angka random yang dihasilkan */
 int hasil; 
 
 /** Melakukan loop 100 kali */
 for ( int counter = 1; counter <= 100; counter++ ){
  
  /**Mengambil angka acak dari 1 - 9 */
  hasil = 1 + angkaRandom.nextInt( 9 );
  
  /**menampilkan hasil dengan print format*/
  System.out.printf( "%d ", hasil ); // menampilkan angka random
  
  /**jika counter habis di bagi 10, mulai baris baru sebagai output*/
  if ( counter % 10 ==  )
   System.out.println();
  
  } 
 
 } 
 
} 

// 2.
package deretbilangan;

import java.util.Scanner;

/**
 *
 * @author Fahrul
 */
public class DeretBilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int angka1=0,angka2=1,deret,hasil;
     
     
        System.out.println("Masukkan bilangan: ");
        deret = input.nextInt();
     
        if (deret>2){
        for(int i=0;i<deret;i++){
            hasil=angka1+angka2;
            angka1=angka2;
            angka2=hasil;
            System.out.print(hasil);
            System.out.print(" , ");
        }
        }else{
            System.out.println("Deret kurang dari 2");
        }
    }
 
}

// no 3.
public class Bilanganprima{
    public static void main (String[] args){
        int input = 100;
        System.out.println("Bilangan Prima 1 hingga 100 adalah : ");
        for(int i=2; i<input; i++) {
            boolean isPrima = true;
            
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    isPrima = false;
                    break;
                    
                }
            }
            if(isPrima==true){
                System.out.print(i+",");
            }
        }
    }
}
