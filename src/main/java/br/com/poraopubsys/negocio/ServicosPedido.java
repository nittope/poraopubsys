/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poraopubsys.negocio;

import br.com.poraopubsys.entidade.Pedido;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Marcus Vinicius
 */
public interface ServicosPedido extends Serializable {
    
    public void cadastrar(Pedido pedido) throws PedidoExistenteException;
    public void atualizar(Pedido pedido) throws PedidoInexistenteException;
    public void remover(Pedido pedido) throws PedidoInexistenteException;
    public List<Pedido> listarTodos();
    
}
