/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poraopubsys.negocio;

import br.com.poraopubsys.entidade.Mesa;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Marcus Vinicius
 */
public interface FachadaServicos extends Serializable{
    public void cadastrar(Mesa mesa) throws MesaExistenteException;
    public void atualizar(Mesa mesa) throws MesaInexistenteException;
    public void remover(String nome) throws MesaInexistenteException;
    public List<Mesa> listarTodas();
    
}
