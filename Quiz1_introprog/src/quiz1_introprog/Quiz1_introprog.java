/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1_introprog;

import javax.swing.JOptionPane;



/**
 *
 * @author leymanwu
 */
public class Quiz1_introprog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double salario=0.0;
    String especialidad=JOptionPane.showInputDialog("Digite tu especialidad 1-SEM o 2-IVN");
    int espe=Integer.parseInt(especialidad);
    
    if (espe==1){
        String sala=JOptionPane.showInputDialog("Digte tu salario");
        salario=Double.parseDouble(sala);
        double salariosem=salario*0.0925;
        
        JOptionPane.showMessageDialog(null,"La empresesa debe abonar un total de "+ salariosem);
    }else{
     String sala=JOptionPane.showInputDialog("Digte tu salario");
        salario=Double.parseDouble(sala);
        double salarioivn=salario*0.0925;
        
        JOptionPane.showMessageDialog(null,"La empresesa debe abonar un total de "+ salarioivn);
        
        
        
        
        
    }
    
    
    
    
    
        
    
    
    
    }
    }
    

