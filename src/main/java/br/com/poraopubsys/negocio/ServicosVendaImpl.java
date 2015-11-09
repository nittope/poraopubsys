/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poraopubsys.negocio;


import br.com.poraopubsys.entidade.Venda;
import br.com.poraopubsys.persistencia.RepositorioVendas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marcus Vinicius
 */
@Service
public class ServicosVendaImpl implements ServicosVenda {
    
    @Autowired
    private RepositorioVendas repositorio;
    
    @Override
    public void cadastrar(Venda venda) throws VendaExistenteException {        
        repositorio.save(venda);           
        
    }

    @Override
    public void atualizar(Venda venda) throws VendaInexistenteException {
        
        Venda vendaAtualizar = repositorio.findByRodada(venda.getRodadas());
        
        if(vendaAtualizar == null)
            throw new VendaInexistenteException();
        vendaAtualizar.setRodadas(venda.getRodadas());
        vendaAtualizar.setTotal(venda.getTotal());       
            
            
        
       
        
    }

    @Override
    public void remover(Venda venda) throws VendaInexistenteException {
        Venda vendaAtualizar = repositorio.findByRodada(venda.getRodadas());
        
        if(vendaAtualizar == null)
            throw new VendaInexistenteException();
        repositorio.delete(vendaAtualizar);
        
    }

    @Override
    public List<Venda> listarTodas() {
        
        return(List<Venda>) repositorio.findAll();
        
    }
    
}
