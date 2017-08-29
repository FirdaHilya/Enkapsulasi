/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author firdahilya
 */
public class UjiBus {
 
     public static void main(String[] arg){
      //membuat objek bus mini
        Bus busMini =new Bus();
        //memasukan nilai jumlah penumpang dan penumpang
        //maksimal ke dalam objek bus mini
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        //memanggil method cetak ke pada kelas bus
        busMini.cetak();
        
        //menambahkan penumpang ke bus mini
        busMini.penumpang = busMini.penumpang + 5;
        //memanggil ethod cetak pada kelas bus
        busMini.cetak();
        
        //mengurangi jumlah penumpang pada busmini
        busMini.penumpang = busMini.penumpang -2 ;
        busMini.cetak();
        
        //menambahkan jumlah penumpang pada bus 
        busMini.penumpang=busMini.penumpang +8;
        busMini.cetak();
    }  
}
