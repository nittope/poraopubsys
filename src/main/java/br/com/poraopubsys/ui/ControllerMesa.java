/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poraopubsys.ui;

import br.com.poraopubsys.entidade.Mesa;
import br.com.poraopubsys.negocio.FachadaServicos;
import br.com.poraopubsys.negocio.MesaExistenteException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Marcus Vinicius
 */
@Controller
@RequestMapping("/poraopubsys")
public class ControllerMesa {
    
    @Autowired
    private FachadaServicos fachada;
    
    @RequestMapping("/hello/{nome}")
    public String hello(@PathVariable String nome){
        return "teste";
    }
    
    @RequestMapping(value = "/mesas/listar", method = RequestMethod.POST)
    public @ResponseBody List<Mesa> listarTodas(){
        return fachada.listarTodasAsMesas();
    }
    
    @RequestMapping("/mesas/add")
    public ResponseEntity<?> addUser (Mesa mesa){
        try{
            fachada.cadastrarMesa(mesa);
            return new ResponseEntity<String>(HttpStatus.OK);
        }
        catch(MesaExistenteException mesaexistente){
            return new ResponseEntity<MesaExistenteException>(mesaexistente, HttpStatus.BAD_REQUEST);
            
        }
    }
    
}
