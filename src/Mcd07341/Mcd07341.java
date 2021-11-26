package Mcd07341;
//mengkomplikasi kelas-kelas sesuai dengan packagenya masing-masing
import java.util.Scanner;
//mengimportkan atau mengelompokkan scanner ke program
public class Mcd07341 {
    public static void main(String[] args){         //class utama program
        Scanner scan = new Scanner(System.in);      //membuat Scanner baru
        int discon07341;        // Tipe data Integer dengan variable discon
        int total07341;         // Tipe data Integer dengan variable total
        int jumlah_data07341;   // Tipe data Integer dengan variable jumlah data
        
        String[] pesanan07341 = new String[20]; // Tipe data String menggunakan Sebuah Array dari variable pesanan
        int[] jml_pesanan07341 = new int[20];   // Tipe data Interger menggunakan Sebuah Array dari variable jumlah pesanan 
        int[] harga07341 = new int[20];         // Tipe data Interger menggunakan Sebuah Array dari variable harga
        int[] jml07341 = new int[5];            // Tipe data Interger menggunakan Sebuah Array dari variable jumlah
        
        // INPUT
        
        System.out.println("Masukkan nama =");
        String nama07341 = scan.nextLine();     // Memasukkan nama *NextLine(); sebagai penambah space
        System.out.println("Jumlah Data = ");   
        jumlah_data07341 = scan.nextInt();      // Memasukkan jumlah data *NextInt(); sebagai masukkan nilai
        
        for(int i=1;i<=jumlah_data07341;i++){   // Perulangan For
        
            System.out.println("=========MCD Joongkok=========");
            System.out.println("Data ke-"+i);          
            System.out.println("Masukkan Pesanan =");    
            pesanan07341[i] = scan.next();              // Memasukkan Pesanan
            System.out.println("Jumlah Pesanan =");
            jml_pesanan07341[i] = scan.nextInt();       // Memasukkan Jumlah Pesanan
            System.out.println("Masukkan Harga =");        
            harga07341[i] = scan.nextInt();             // Memasukkan Harga
            System.out.println("Total harga pesanan =");
            jml07341[i] = harga07341[i]*jml_pesanan07341[i]; 
            System.out.println(jml07341[i]);            // Menampilkan total harga pesanan dari 
                                                        // variable jumlah = harga*jumlah pesanan
                    
        
        System.out.println("=============NOTE=============");
        // OUTPUT
        // Pengujian If-Else
        if (jml07341[i]>=500000){       // jika jumlah harga lebih dari sama dengan 500000
            discon07341 = jml07341[i]*40/100;       // Rumus Discout = jumlah harga * nilai discount 
            total07341 = jml07341[i]-discon07341;   // Total dari harga yang sudah di Discout = jumlah harga - jumlah discout
            System.out.println("Atas Nama =" + nama07341);                  // Mencetak Nama
            System.out.println("Nama Pesanan =" + pesanan07341[i]);         // Mencetak Pesanan
            System.out.println("Total Harga + discon 40% =" + total07341);  // Mencetak TOtal Harga + Discount -%
        }else if (jml07341[i]>=350000){ // jika jumlah harga lebih dari sama dengan 350000
            discon07341 = jml07341[i]*25/100;
            total07341 = jml07341[i]-discon07341;
            System.out.println("Atas Nama =" + nama07341);                  // Mencetak Nama
            System.out.println("Nama Pesanan =" + pesanan07341[i]);         // Mencetak Pesanan
            System.out.println("Total Harga + discon 25% =" + total07341);  // Mencetak Total Harga + Discount -%
            
        }else if (jml07341[i]>=200000){ // jika jumlah harga lebih dari sama dengan 200000
            discon07341 = jml07341[i]*20/100;
            total07341 = jml07341[i]-discon07341;
            System.out.println("Atas Nama =" + nama07341);                  // Mencetak Nama
            System.out.println("Nama Pesanan =" + pesanan07341[i]);         // Mencetak Pesanan
            System.out.print("Total Harga + discon 20% =" + total07341);    // Mencetak Total Harga + Discount -%
            
        }else if (jml07341[i]<200000){  // jika jumlah harga lebih kecil dari 200000
            discon07341 = jml07341[i]*0/100;
            total07341 = jml07341[i]-discon07341;
            System.out.println("Atas Nama =" + nama07341);                  // Mencetak Nama
            System.out.println("Nama Pesanan =" + pesanan07341[i]);         // Mencetak Pesanan
            System.out.print("Total Harga =" + total07341);                 // Mencetak Total Harga
            
        }
        System.out.println("\n------------------------");
        }
    }
}