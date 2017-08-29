/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author firdahilya
 */
public class UjiBus {
    public static void main(String[] arg){
        
        //membuat objek bus besar dari kelas bus
        Bus busBesar = new Bus(40);
        busBesar.cetak();
        //penambahan penumpang
        busBesar.addPenumpang(15);
        busBesar.cetak();
        busBesar.addPenumpang(5);
        busBesar.cetak();
        busBesar.addPenumpang(26);
        busBesar.cetak();       
    } 
 }

