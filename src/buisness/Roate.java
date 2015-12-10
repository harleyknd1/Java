/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buisness;

/**
 *
 * @author KiritoKazuto
 */
public class Roate {
    private String text1;
    private String text2;
    private String text3;
    
    public String getText1(){
        return this.text1;
    }
    
    public String getText2(){
        return this.text2;
    }
    
    public String getText3(){
        return this.text3;
    }
    
    public void rotateUp(){
        String save = text1;
        text1 = text2;
        text2 = text3;
        text3 = save;
        System.out.println(text1 + "\t" + text2 + "\t" + text3);
    }
    public void rotateDown(){
        String save = text3;
        text3 = text2;
        text2 = text1;
        text1 = save;
        System.out.println(text1 + "\t" + text2 + "\t" + text3);
    }
}
