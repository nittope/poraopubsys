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
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marcus Vinicius
 */
@Service
public class FachadaServicosImpl implements FachadaServicos {
    
    @Autowired
    private ServicosMesa servicosMesa;
    
    @Autowired
    private ServicosCliente servicosCliente;
    
    @Autowired
    private ServicosItem servicosItem;
    
    @Autowired
    private ServicosPedido servicosPedido;
    
    @Autowired
    private ServicosProduto servicosProduto;
    
    @Autowired
    private ServicosRodada servicosRodada;
    
    @Autowired
    private ServicosUsuario servicosUsuario;
    
    private ServicosVenda servicosVenda;

    @Override
    public void cadastrarMesa(Mesa mesa) throws MesaExistenteException {
        servicosMesa.cadastrar(mesa);
    }

    @Override
    public void atualizarMesa(Mesa mesa) throws MesaInexistenteException {
        servicosMesa.atualizar(mesa);
    }

    @Override
    public void removerMesa(String nome) throws MesaInexistenteException {
        servicosMesa.remover(nome);
    }

    @Override
    public List<Mesa> listarTodasAsMesas() {
        return servicosMesa.listarTodas();
    }

    @Override
    public void cadastrarCliente(Cliente cliente) throws ClienteExistenteException {
        servicosCliente.cadastrar(cliente);
    }

    @Override
    public void atualizarCliente(Cliente cliente) throws ClienteInexistenteException {
        servicosCliente.atualizar(cliente);
    }

    @Override
    public void removerCliente(String nome) throws ClienteInexistenteException {
        servicosCliente.remover(nome);
    }

    @Override
    public List<Cliente> listarTodosOsClientes() {
        return servicosCliente.listarTodos();
    }

    @Override
    public void cadastrarItem(Item item) throws ItemExistenteException {
        servicosItem.cadastrar(item);
    }

    @Override
    public void atualizarItem(Item item) throws ItemInexistenteException {
        servicosItem.atualizar(item);
    }

    @Override
    public void removerItem(Item item) throws ItemInexistenteException {
        servicosItem.remover(item);
    }

    @Override
    public List<Item> listarTodosOsItens() {
        return servicosItem.listarTodos();
    }

    @Override
    public void cadastrarPedido(Pedido pedido) throws PedidoExistenteException {
        servicosPedido.cadastrar(pedido);
    }

    @Override
    public void atualizarPedido(Pedido pedido) throws PedidoInexistenteException {
        servicosPedido.atualizar(pedido);
    }

    @Override
    public void removerPedido(Pedido pedido) throws PedidoInexistenteException {
        servicosPedido.remover(pedido);
    }

    @Override
    public List<Pedido> listarTodosOsPedidos() {
        return servicosPedido.listarTodos();
    }

    @Override
    public void cadastrarProduto(Produto produto) throws ProdutoExistenteException {
        servicosProduto.cadastrar(produto);
    }

    @Override
    public void atualizarProduto(Produto produto) throws ProdutoInexistenteException {
        servicosProduto.atualizar(produto);
    }

    @Override
    public void removerProduto(String nome) throws ProdutoInexistenteException {
        servicosProduto.remover(nome);
    }

    @Override
    public List<Produto> listarTodosOsProdutos() {
        return servicosProduto.listarTodos();
    }

    @Override
    public void cadastrarRodada(Rodada rodada) throws RodadaExistenteException {
        servicosRodada.cadastrar(rodada);
    }

    @Override
    public void atualizarRodada(Rodada rodada) throws RodadaInexistenteException {
        servicosRodada.atualizar(rodada);
    }

    @Override
    public void removerRodada(Long id) throws RodadaInexistenteException {
        servicosRodada.remover(id);
    }

    @Override
    public List<Rodada> listarTodasAsRodadas() {
        return servicosRodada.listarTodas();
    }

    @Override
    public void cadastrarUsuario(Usuario usuario) throws UsuarioExistenteException {
        servicosUsuario.cadastrar(usuario);
    }

    @Override
    public void atualizarUsuario(Usuario usuario) throws UsuarioInexistenteException {
        servicosUsuario.atualizar(usuario);
    }

    @Override
    public void remverUsuario(String nome) throws UsuarioInexistenteException {
        servicosUsuario.remover(nome);
    }

    @Override
    public List<Usuario> listarTodosOsUsuarios() {
        return servicosUsuario.listarTodos();
    }

    @Override
    public void cadastrarVenda(Venda venda) throws VendaExistenteException {
        servicosVenda.cadastrar(venda);
    }

    @Override
    public void atualizarVenda(Venda venda) throws VendaInexistenteException {
        servicosVenda.atualizar(venda);
    }

    @Override
    public void removerVenda(Venda venda) throws VendaInexistenteException {
        servicosVenda.remover(venda);
    }

    @Override
    public List<Venda> ListarTodasAsVendas() {
        return servicosVenda.listarTodas();
    }
    
}
