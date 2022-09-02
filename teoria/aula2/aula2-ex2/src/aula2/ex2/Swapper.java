/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2.ex2;

/**
 *
 * @author uniejoalbuquerque
 */
public class Swapper {
    private float x,y,aux;
    
    public void setX(float a){
        x = a;
    }
    
    public void setY(float a){
        y = a;
    }
    
    public float getY(){
        return y;
    }
    
    public float getX(){
        return x;
    }
    
    public void swap(){
        aux = x;
        x = y;
        y = aux;
    }
    
}
