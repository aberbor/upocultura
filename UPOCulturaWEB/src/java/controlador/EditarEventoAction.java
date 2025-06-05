/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import modelo.*;
/**
 *
 * @author elres
 */
public class EditarEventoAction extends ActionSupport {
    
    private int selectedEvento;
    private Evento evento;
    private UPOCultura dao = new UPOCultura();
    
    public EditarEventoAction() {
    }
    
    public String execute() throws Exception {
        
        List<Evento> eventos = dao.obtenerTodosEventos();
        
        evento = eventos.get(selectedEvento);
         
        return SUCCESS;
    }
    
}
