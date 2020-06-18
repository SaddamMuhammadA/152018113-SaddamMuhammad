/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author Saddam Muhammad A
 */
public class hewan implements Komponen {

    @Override
    public void Duck() {
        System.out.println("Duck = " +nama + breed +umur );
        System.out.println(""+suara);
    }

    @Override
    public void Cat() {
        System.out.println("Cat = " +nama1 + breed1 +umur1 );
        System.out.println(""+suara1);
    }

    @Override
    public void Dog() {
        System.out.println("Dog = " +nama2 + breed2 +umur2 );
        System.out.println(""+suara2);
    }

    
}
