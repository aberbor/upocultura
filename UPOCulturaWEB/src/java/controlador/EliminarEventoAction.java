/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.opensymphony.xwork2.ActionSupport;
import modelo.UPOCultura;

/**
 *
 * @author elres
 */
public class EliminarEventoAction extends ActionSupport {
    
    private UPOCultura dao = new UPOCultura();
    private int selectedEvento;
    
    public EliminarEventoAction() {
    }
    
    public String execute() throws Exception {
        
        dao.eliminarEvento(selectedEvento);
        return SUCCESS;
    }
    
}
