/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FramePrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class ManejadorFramePrincipal implements ActionListener  {

    FramePrincipal framePrincipal;
    
    public ManejadorFramePrincipal(FramePrincipal framePrincipal){
    this.framePrincipal = framePrincipal;
    }//Fin
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         if (e.getActionCommand().equalsIgnoreCase("Calcular")) {

            framePrincipal.setResultado(framePrincipal.getExpresion());
            //System.exit(0);

        }
    }//Fin actionPerformed
    
}
