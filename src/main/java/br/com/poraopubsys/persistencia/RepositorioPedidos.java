/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poraopubsys.persistencia;

import br.com.poraopubsys.entidade.Cliente;
import br.com.poraopubsys.entidade.Mesa;
import br.com.poraopubsys.entidade.Pedido;
import br.com.poraopubsys.entidade.Rodada;
import br.com.poraopubsys.entidade.Usuario;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Marcus Vinicius
 */
public interface RepositorioPedidos extends CrudRepository<Pedido, Long> {
    public List<Pedido> findByData(Date data);
    public List<Pedido> findByDataAndMesa(Date data, String mesa);
    public List<Pedido> findByMesa(Mesa mesa);
    public List<Pedido> findByUsuario(Usuario usuario);
    public List<Pedido> findByUsuarioAndData(Usuario usuario, Date data);
    //public List<Pedido> findByRodada(Long rodada);
    public List<Pedido> findByRodadaAndCliente(Rodada rodada, Cliente cliente);
    public List<Pedido> findByCliente(Cliente cliente);

    public Pedido findByRodada(Rodada rodada);
    
}
