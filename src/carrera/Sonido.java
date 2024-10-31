/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


public class Sonido implements Runnable{
   Player player;
    public Sonido(){
        
    

  
    }
    @Override
    public void run() {
        try{
            FileInputStream fis;
            fis=new FileInputStream("C:\\Users\\user\\Music\\Mötley Crüe - Same Ol Situation Official Remaster.mp3");
            player= new Player(fis);   
            player.play();
        }catch (JavaLayerException e){
            JOptionPane.showMessageDialog(null, "Error "+e);
        }catch(FileNotFoundException e){
             JOptionPane.showMessageDialog(null, "Error "+e);
        }
    }
}
