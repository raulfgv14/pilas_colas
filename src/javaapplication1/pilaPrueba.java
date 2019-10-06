/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class pilaPrueba implements Pila{
    private int top = 0;
    private Object objetosPila[] ;
    private int capacidad = 0;
    
    public void InicializaArray(){
        this.capacidad = 1000;
    }
    
    public void InicializaArray(int cap){
        capacidad = cap;
        objetosPila = new Object[capacidad];
    }
    
    public int longitud(){
        return(top);
    }
    
    public int capacidad(){
        return(capacidad);
    }
    
    public boolean esVacia(){
        return(top<=0);
    }
 
    public void push(Object nodo){
        if(longitud()<capacidad) objetosPila[++top] = nodo;
        
    }
    
    public String imprimir(){
        return Arrays.toString(objetosPila);
    }
}
