package com.iumafis.tallerpractico.model;

import javax.swing.JOptionPane;

public final class Person {
    
    private String name;
    private int age;

    public Person() {
        inicializar();
    }
    
    private void inicializar() {
        this.name = JOptionPane.showInputDialog(null, "Ingrese el nombre de la persona");
        this.age = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad de la persona"));
    }
    
    public void imprimir() {
        System.out.println(String.format("La persona: %s tiene %s años y %s.", this.name, this.age, esMayorEdad()));
    }
    
    private String esMayorEdad() {
        return (this.age >= 18) ? "es mayor de edad" : "no es mayor de edad";
    }
}
