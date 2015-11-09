/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poraopubsys.negocio;

import br.com.poraopubsys.entidade.Item;
import br.com.poraopubsys.persistencia.RepositorioItens;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marcus Vinicius
 */
@Service
public class ServicosItemImpl implements ServicosItem {
    
    @Autowired
    private RepositorioItens repositorio;

    @Override
    public void cadastrar(Item item) throws ItemExistenteException {
        
        repositorio.save(item);
        
    }

    @Override
    public void atualizar(Item item) throws ItemInexistenteException {
        
    }

    @Override
    public void remover(Item item) throws ItemInexistenteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Item> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
