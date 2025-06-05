/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.Map;
import modelo.Evento;
import modelo.UPOCultura;
import modelo.Usuario;

/**
 *
 * @author Josema
 */
public class PrincipalAction extends ActionSupport {
    
    private List<Evento> listaEventos;
    private UPOCultura upoCultura = new UPOCultura();
    private Map<String, Object> session;
    
    public PrincipalAction() {
    }
    
    public String execute() throws Exception {
        UPOCultura upo = new UPOCultura();
        listaEventos = upoCultura.obtenerTodosEventos();
        Usuario user = (Usuario) session.get("usuario");        //NO SE SI ESTA BIEN LA VERDAD PERO SE PRETENDE PASAR EL TIPO DESDE LA SESSION
        
        return user.getTipo();
    }

    public List<Evento> getListaEventos() {
        return listaEventos;
    }
    
    
}
