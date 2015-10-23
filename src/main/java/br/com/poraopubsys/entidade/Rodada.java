/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poraopubsys.entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Marcus Vinicius
 */
@Entity
public class Rodada implements Serializable {
    
    private Long id;
    private List <Pedido> pedidos;
    private Mesa mesa;    
    private Venda venda;
    private List<Cliente> clientes;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }     
    

    @ManyToOne
    public Mesa getMesa() {
        return mesa;
    }
    
    @OneToMany(mappedBy = "rodada")
    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    @OneToMany(mappedBy = "rodada")
    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
        

    @ManyToOne
    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.pedidos);
        hash = 83 * hash + Objects.hashCode(this.mesa);
        hash = 83 * hash + Objects.hashCode(this.venda);
        hash = 83 * hash + Objects.hashCode(this.clientes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rodada other = (Rodada) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.pedidos, other.pedidos)) {
            return false;
        }
        if (!Objects.equals(this.mesa, other.mesa)) {
            return false;
        }
        if (!Objects.equals(this.venda, other.venda)) {
            return false;
        }
        if (!Objects.equals(this.clientes, other.clientes)) {
            return false;
        }
        return true;
    }

    public Rodada(Mesa mesa, Venda venda) {
        this.pedidos = new ArrayList<>();
        this.mesa = mesa;
        this.venda = venda;
        this.clientes = new ArrayList<>();
    }

    public Rodada() {
    }
    
    
    
}
