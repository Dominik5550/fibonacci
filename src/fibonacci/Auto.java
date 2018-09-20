/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Dominik
 */
public class Auto {
    private int przebieg = 0;
    
    public void setPrzebieg(int value){
        this.przebieg += value;
    }
    public int getPrzebieg(){
        return this.przebieg;
    }
    
    public Auto() {
        this.przebieg = 1;
    }
}
