/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author firdahilya
 */
public class TestSiswa {
    public static void main (String arg[]){
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Firda");
        siswa.setAbsen(23);
        siswa.setAddress("Malang");
        
        System.out.println("Name : " + siswa.getName()+" Absen : "
                +siswa.getAbsen()+" Address: " 
                +siswa.getAddress());
    }
    
}
