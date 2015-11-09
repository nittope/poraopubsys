/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poraopubsys.negocio;

import br.com.poraopubsys.entidade.Item;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Marcus Vinicius
 */
public interface ServicosItem extends Serializable {
    
    public void cadastrar (Item item) throws ItemExistenteException;
    public void atualizar (Item item) throws ItemInexistenteException;
    public void remover (Item item) throws ItemInexistenteException;
    public List<Item> listarTodos();
    
}
