/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poraopubsys.persistencia;

import br.com.poraopubsys.entidade.Item;
import br.com.poraopubsys.entidade.Produto;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Marcus Vinicius
 */
public interface RepositorioProdutos extends CrudRepository<Produto, Long> {
    public Produto findByNome(String nome);
    public List<Produto> findByItem(Item item);
}
