/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula09;

/**
 *
 * @author Nathany
 */
public class Bloco {
    Bloco  próximo ;
    Object elemento;
    public Bloco (Object elemento) {
        this.elemento = elemento; 
    }
    public Bloco (Bloco proximo, Object elemento){
        this.próximo = proximo;
        this.elemento = elemento;
    }
    void setProximo (Bloco proximo){
       this.próximo = proximo;
    }
    Bloco getProximo (){
        return this.próximo;
    }
    Object getElemento () {
        return this.elemento;
    }
}
