/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poraopubsys.negocio;

import br.com.poraopubsys.entidade.Produto;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Marcus Vinicius
 */
public interface ServicosProduto extends Serializable {
    public void cadastrar(Produto produto) throws ProdutoExistenteException;
    public void atualizar(Produto produto) throws ProdutoInexistenteException;
    public void remover(String nome) throws ProdutoInexistenteException;
    public List<Produto> listarTodos();
    
}
