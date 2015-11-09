/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poraopubsys.negocio;

import br.com.poraopubsys.entidade.Pedido;
import br.com.poraopubsys.persistencia.RepositorioPedidos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marcus Vinicius
 */
@Service
public class ServicosPedidoImpl implements ServicosPedido {
    
    @Autowired
    private RepositorioPedidos repositorio;

    @Override
    public void cadastrar(Pedido pedido) throws PedidoExistenteException {
        repositorio.save(pedido);
    }

    @Override
    public void atualizar(Pedido pedido) throws PedidoInexistenteException {
        Pedido pedidoAtualizar = repositorio.findByRodada(pedido.getRodada());
        
        if(pedidoAtualizar == null)
            throw new PedidoInexistenteException();
        
       pedidoAtualizar.setCliente(pedido.getCliente());
       pedidoAtualizar.setData(pedido.getData());
       pedidoAtualizar.setHoraPedido(pedido.getHoraPedido());
       pedidoAtualizar.setMesa(pedido.getMesa());
       pedidoAtualizar.setRodada(pedido.getRodada());
       pedidoAtualizar.setUsuario(pedido.getUsuario());
       
        
    }

    @Override
    public void remover(Pedido pedido) throws PedidoInexistenteException {
        
      
        Pedido pedidoAtualizar = repositorio.findByRodada(pedido.getRodada());   
   
        
        if(pedidoAtualizar == null)
            throw new PedidoInexistenteException();
        repositorio.delete(pedidoAtualizar);
        
    }

    @Override
    public List<Pedido> listarTodos() {
        return (List<Pedido>) repositorio.findAll();
        
    }
    
}
