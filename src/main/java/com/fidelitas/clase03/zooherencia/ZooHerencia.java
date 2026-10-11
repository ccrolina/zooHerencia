/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fidelitas.clase03.zooherencia;

/**
 *
 * @author milec
 */
public class ZooHerencia {

    public static void main(String[] args) {
        
        Animal perro = new Doberman("Lassie");
        Mamifero gato = new Persa("Manchas");
        
        Animal pato = new Ave("Perry");
        Rouen otroPato = new Rouen("Donald");
        Ave tercerPato = new Pato("Rico McPato");
        
        System.out.println(perro.hacerSonido());
        System.out.println(gato.hacerSonido());
        
        System.out.println("----- LOS PATOS -----");
        System.out.println(pato.hacerSonido());
        System.out.println(otroPato.hacerSonido());
        System.out.println(tercerPato.hacerSonido());
        
    }
    
}
