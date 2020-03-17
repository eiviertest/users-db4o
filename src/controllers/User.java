/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import config.ConexionDB4O;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author kapx3
 */
public class User extends ConexionDB4O {
 
    public User(){
        
    }
    
    /* public DefaultTableModel usuario(){
        String titulos[] = {"NoUsuario", "Nombre", "Aias", "Edad", 
            "Colonia", "Calle", "No Ext", "No Int", "CP" , "Comunidad" , "Telefono"};
        DefaultTableModel dtm = new DefaultTableModel(null, titulos);
        Usuario usuario = null;
        Usuario[] p = this.Consultar(usuario);
        if (p != null){
            for (Usuario usr : p){
                Object[] cli = new Object[9];
                cli[0] = usr.getNoUsuario();
                cli[1] = usr.getNombre();
                cli[2] = usr.getApellidos();
                cli[3] = usr.getEmail();
                cli[4] = usr.getContrasena();
                cli[5] = usr.getTelefono();
                cli[6] = usr.getTipo();
                cli[7] = usr.getRango();
                cli[8] = usr.getPuesto();
                dtm.addRow(cli);
            }
        }
        return dtm;
    } */

}
