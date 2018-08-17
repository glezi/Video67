/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video67;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author gleez
 */
public class Video67 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoBotones mimacro=new MarcoBotones(); 
        
        mimacro.setVisible(true); 
        
        mimacro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class MarcoBotones extends JFrame{
    public MarcoBotones(){
        setTitle("Botones y Eventos"); 
        setBounds(700,300,500,300);
        LaminaBotones miLamina = new LaminaBotones(); 
        add(miLamina);
        
    }
            
}

class LaminaBotones extends JPanel  {

      JButton botonAzul = new JButton("Azul");
      JButton botonAmarillo = new JButton("Amarillo"); 
      JButton botonRojo = new JButton("Rojo");
              
     public LaminaBotones(){

        add(botonAzul); 
        add(botonAmarillo); 
        add(botonRojo); 
        
        ColorFondo Amarillo = new ColorFondo(Color.yellow);
        ColorFondo Azul= new ColorFondo(Color.blue);
        ColorFondo Rojo = new ColorFondo(Color.red);
        
        botonAzul.addActionListener(Azul); 
        botonAmarillo.addActionListener(Amarillo); 
        botonRojo.addActionListener(Rojo); 
     } 
     
     private class ColorFondo implements ActionListener{
    
    public ColorFondo(Color c){
        colorDeFondo=c; 
    }
    
    public void actionPerformed(ActionEvent e){
        
        setBackground(colorDeFondo);
    }
    
    private Color colorDeFondo; 
}
    
}



