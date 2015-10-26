/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poraopubsys.negocio;

import br.com.poraopubsys.entidade.Usuario;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Marcus Vinicius
 */
public interface ServicosUsuario extends Serializable {
    
    public void cadastrar (Usuario usuario) throws UsuarioExistenteException;
    public void atualizar (Usuario usuario) throws UsuarioInexistenteException;
    public void remover (String nome) throws UsuarioInexistenteException;
    public List<Usuario> listarTodos();
}
