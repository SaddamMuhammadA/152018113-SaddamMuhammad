/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.pkg5;

/**
 *
 * @author ASUS
 */
public class MembuatKue extends komponen{
    
    @Override
    void bahan_bahan(){
        String bahan1="Terigu";
        String bahan2="Gula";
        String bahan3="Telur";
        System.out.println("========Bahan-Bahan========");
        System.out.println("1. "+bahan1);
        System.out.println("2. "+bahan2);
        System.out.println("3. "+bahan3);
        
    }
    
    @Override
    void peralatan(){
        String alat1="Oven";
        String alat2="Mixer";
        String alat3="Loyang";
        System.out.println("========Alat-alat========");
        System.out.println("1. "+alat1);
        System.out.println("2. "+alat2);
        System.out.println("3. "+alat3);        
    }
    
    @Override
    void proses_pembuatan(){
        System.out.println("========Proses Pembuatan========");
        System.out.println("1. Aduk ");
        System.out.println("2. Jilat");
        System.out.println("3. Celupin");
        
    }
        
}
