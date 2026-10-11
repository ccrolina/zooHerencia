/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.clase03.zooherencia;

/**
 *
 * @author milec
 */
public class Gato extends Mamifero {
    
    //Constructor
    public Gato(String nombre) {
        super(nombre);
    }

    //Override Method
    @Override
    public String hacerSonido() {
        return super.hacerSonido() + " Miau Miau ";
    }
    
}
