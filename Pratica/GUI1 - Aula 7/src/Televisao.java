/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author uniejoalbuquerque
 */
public class Televisao {
    
    private int canal;
    private int som;
    private boolean ligada;
    
    public Televisao(){
        this.canal = 1;
        this.som = 0;
        this.ligada = false;
    }
    
    public Televisao(int c, int s){
        this.canal = c;
        this.som = s;
    }
    
    public Televisao(int c, int s, boolean v){
        this.canal = c;
        this.som = s;
        this.ligada = v;
    }
    
    
    public int getCanal(){
        return this.canal;
    }
    
    public void setCanal(int c){
        if ((c <=64)&&(c>=1)&&(this.ligada==true)){
            this.canal = c;
        }
    }
    
    public int getSom(){
        return som;        
    }
    
    public boolean getLigada(){
        return ligada;
    }
    
    public void setLigada(boolean v){
        this.ligada = v;
    }
    
    public String toString(){
        return "Ligada: "+ligada+"\nCanal: "+canal+"\nSom: "+som+"\n\n";
    }
    
    public boolean aumentarVolume(){
        if (this.ligada == true){
            if (this.som<10){
                this.som++;
                return true;
            }
        }
        return false;
    }
    
    public boolean reduzirVolume(){
        if (this.ligada == true){
            //if (this.som<0)
            if (this.som>0){
                this.som--;
                return true;
            }
        }
        return false;
    }
    
    public boolean subirCanal(){
        if (this.ligada == true){
            if (this.canal<64){
                this.canal++;
                return true;
            }
            
        }
        return false;
    }
    
    public boolean descerCanal(){
        if (this.ligada == true){
            if (this.canal>1){
                this.canal--;
                return true;
            }
          
        }
        return false;
    }
       
   public void LigaouDesligaTV(){
        if (this.ligada == true){
            this.ligada = false;
        }
        else{ 
            this.ligada = true;
        }
    }


    
    
    
   }

