/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poraopubsys.negocio;

import br.com.poraopubsys.entidade.Venda;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Marcus Vinicius
 */
public interface ServicosVenda extends Serializable {
    
    public void cadastrar(Venda venda) throws VendaExistenteException;
    public void atualizar(Venda venda) throws VendaInexistenteException;
    public void remover(Venda venda) throws VendaInexistenteException;
    public List<Venda> listarTodas();
    
}
