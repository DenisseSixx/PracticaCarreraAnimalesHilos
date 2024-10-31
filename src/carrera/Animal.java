/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author user
 */
public class Animal extends Thread {
    String nombre;
    int limite;
    JLabel label;
    int fila;
    JTextArea TAreaMeta;                

    public Animal(String nombre, int limite, JLabel label, int fila, JTextArea TAreaMeta) {
        this.nombre = nombre;
        this.limite = limite;
        this.label = label;
        this.fila = fila;
        this.TAreaMeta = TAreaMeta;
    }
                    
    @Override
                    public void run(){
                        this.TAreaMeta.setText("");
                        for(int i=0;i<limite;i++){
                            try{
                                label.setLocation(i, fila);
                                Thread.sleep(20);
                            }catch (InterruptedException e){
                                JOptionPane.showMessageDialog(null,"Error: "+e);
                            }
                            
                        }
                        TAreaMeta.append(nombre+"\n");
                    }
}
