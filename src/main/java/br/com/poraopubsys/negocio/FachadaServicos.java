/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poraopubsys.negocio;

import br.com.poraopubsys.entidade.Cliente;
import br.com.poraopubsys.entidade.Item;
import br.com.poraopubsys.entidade.Mesa;
import br.com.poraopubsys.entidade.Pedido;
import br.com.poraopubsys.entidade.Produto;
import br.com.poraopubsys.entidade.Rodada;
import br.com.poraopubsys.entidade.Usuario;
import br.com.poraopubsys.entidade.Venda;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Marcus Vinicius
 */
public interface FachadaServicos extends Serializable{
    public void cadastrarMesa(Mesa mesa) throws MesaExistenteException;
    public void atualizarMesa(Mesa mesa) throws MesaInexistenteException;
    public void removerMesa(String nome) throws MesaInexistenteException;
    public List<Mesa> listarTodasAsMesas(); 
    
    public void cadastrarCliente(Cliente cliente) throws ClienteExistenteException;
    public void atualizarCliente(Cliente cliente) throws ClienteInexistenteException;
    public void removerCliente(String nome) throws ClienteInexistenteException;
    public List<Cliente> listarTodosOsClientes();
    
    public void cadastrarItem(Item item) throws ItemExistenteException;
    public void atualizarItem(Item item) throws ItemInexistenteException;
    public void removerItem(Item item) throws ItemInexistenteException;
    public List<Item> listarTodosOsItens();
    
    public void cadastrarPedido(Pedido pedido) throws PedidoExistenteException;
    public void atualizarPedido(Pedido pedido) throws PedidoInexistenteException;
    public void removerPedido(Pedido pedido) throws PedidoInexistenteException;
    public List<Pedido> listarTodosOsPedidos();
    
    public void cadastrarProduto(Produto produto) throws ProdutoExistenteException;
    public void atualizarProduto(Produto produto) throws ProdutoInexistenteException;
    public void removerProduto(String nome) throws ProdutoInexistenteException;
    public List<Produto> listarTodosOsProdutos();
    
    public void cadastrarRodada(Rodada rodada) throws RodadaExistenteException;
    public void atualizarRodada(Rodada rodada) throws RodadaInexistenteException;
    public void removerRodada(Long id) throws RodadaInexistenteException;
    public List<Rodada> listarTodasAsRodadas();
    
    public void cadastrarUsuario(Usuario usuario) throws UsuarioExistenteException;
    public void atualizarUsuario(Usuario usuario) throws UsuarioInexistenteException;
    public void remverUsuario(String nome) throws UsuarioInexistenteException;
    public List<Usuario> listarTodosOsUsuarios();
    
    public void cadastrarVenda(Venda venda) throws VendaExistenteException;
    public void atualizarVenda(Venda venda) throws VendaInexistenteException;
    public void removerVenda(Venda venda) throws VendaInexistenteException;
    public List<Venda> ListarTodasAsVendas();
            
    
    
}
