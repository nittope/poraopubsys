/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poraopubsys.negocio;

import br.com.poraopubsys.entidade.Produto;
import br.com.poraopubsys.persistencia.RepositorioProdutos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marcus Vinicius
 */
@Service
public class ServicosProdutoImpl implements ServicosProduto {

    @Autowired
    private RepositorioProdutos repositorio;
    
    @Override
    public void cadastrar(Produto produto) throws ProdutoExistenteException {
        
        if(repositorio.findByNome(produto.getNome())!= null)
            throw new ProdutoExistenteException();
        repositorio.save(produto);
        
    }

    @Override
    public void atualizar(Produto produto) throws ProdutoInexistenteException {
        Produto produtoAtualizar = repositorio.findByNome(produto.getNome());
        
        if(produtoAtualizar != null)
            throw new ProdutoInexistenteException();
        produtoAtualizar.setEstoque(produto.getEstoque());
        produtoAtualizar.setItem(produto.getItem());
        produtoAtualizar.setNome(produto.getNome());
        produtoAtualizar.setPreco(produto.getPreco());
        
        repositorio.save(produtoAtualizar);
    }

    @Override
    public void remover(String nome) throws ProdutoInexistenteException {
        Produto produtoAtualizar = repositorio.findByNome(nome);
        if(produtoAtualizar != null)
            throw new ProdutoInexistenteException();
        repositorio.delete(produtoAtualizar);
    }

    @Override
    public List<Produto> listarTodos() {
        return (List<Produto>) repositorio.findAll();
    }
    
}
