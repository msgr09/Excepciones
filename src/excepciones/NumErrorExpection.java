/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Marlon gonzalez
 */
public class NumErrorExpection extends RuntimeException{
    
    public NumErrorExpection(){
        
    }
     
    public NumErrorExpection(String message){
        super(message);
    }
}
