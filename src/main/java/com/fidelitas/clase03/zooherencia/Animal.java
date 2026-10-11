/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.clase03.zooherencia;

/**
 *
 * @author milec
 */
public class Animal {
    
    private String nombre;

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Constructor
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodo personalizado
    public String hacerSonido() {
        return "Mi sonido es: ";
    }
    
    //to String
    @Override
    public String toString() {
        return "Animal " + "nombre: " + nombre;
    }
    
}
