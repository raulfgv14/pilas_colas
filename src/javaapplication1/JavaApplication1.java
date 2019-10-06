/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author usuario
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pilaPrueba pP    = new pilaPrueba();
        
        // Inicializzamos Pila
        pP.InicializaArray();
        
        // Pregunta, es vacia la Pila?
         System.out.println(pP.esVacia());
         
         // Pregunta, longitud de la Pila?
         System.out.println(pP.longitud());
         
         // Pregunta, capacidad de la Pila?
         System.out.println(pP.capacidad());
        
        // Inicializa nodos Personas
        nodo  ndPersona1 = new nodo();
        nodo  ndPersona2 = new nodo();
        nodo  ndPersona3 = new nodo();
        
        // Raul
        ndPersona1.nombre = "Raul";
        ndPersona1.cedula = "12345";
        ndPersona1.edad   = 19;
        
        // Felipe
        ndPersona1.nombre = "Felipe";
        ndPersona1.cedula = "123456";
        ndPersona1.edad   = 26;
        
        // Camila
        ndPersona1.nombre = "Camila";
        ndPersona1.cedula = "12345";
        ndPersona1.edad   = 22;
        
        // Añadir Nodos a la Pila
        pP.push(ndPersona1.cedula);
        
        // Imprime Pila
        //String mensaje = pP.imprimir();
        //System.out.println(mensaje);
    }
    
}
