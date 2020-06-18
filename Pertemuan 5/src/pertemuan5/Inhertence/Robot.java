/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5.Inhertence;

/**
 *
 * @author ASUS
 */
public class Robot extends Musuh{
    
    void jump(){
        System.out.println("Loncat");
    }
    
    void fly(){
        System.out.println("Terbang");
    }
    
    @Override
    void attack(){
        System.out.println();
    }
}
