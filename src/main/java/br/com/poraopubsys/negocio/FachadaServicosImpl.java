/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poraopubsys.negocio;

import br.com.poraopubsys.entidade.Mesa;
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

    @Override
    public void cadastrar(Mesa mesa) throws MesaExistenteException {
        servicosMesa.cadastrar(mesa);
    }

    @Override
    public void atualizar(Mesa mesa) throws MesaInexistenteException {
        servicosMesa.atualizar(mesa);
    }

    @Override
    public void remover(String nome) throws MesaInexistenteException {
        servicosMesa.remover(nome);
    }

    @Override
    public List<Mesa> listarTodas() {
        return servicosMesa.listarTodas();
    }
    
}
