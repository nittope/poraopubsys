/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poraopubsys.negocio;

import br.com.poraopubsys.entidade.Usuario;
import br.com.poraopubsys.persistencia.RepositorioUsuarios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marcus Vinicius
 */
@Service
public class ServicosUsuarioImpl implements ServicosUsuario {
    

    @Autowired
    private RepositorioUsuarios repositorio;
    
    @Override
    public void cadastrar(Usuario usuario) throws UsuarioExistenteException {
         if (repositorio.findByNome(usuario.getNome())!= null)
            throw new UsuarioExistenteException();
        repositorio.save(usuario);
    }

    @Override
    public void atualizar(Usuario usuario) throws UsuarioInexistenteException {
        Usuario usuarioAtualizar = repositorio.findByNome(usuario.getNome());
        
        if(usuarioAtualizar == null)
            throw new UsuarioInexistenteException();
        usuarioAtualizar.setNome(usuario.getNome());
        usuarioAtualizar.setNiveldeacesso(usuario.getNiveldeacesso());
        usuarioAtualizar.setPedidos(usuario.getPedidos());
        usuarioAtualizar.setLogin(usuario.getLogin());
        usuarioAtualizar.setSenha(usuario.getSenha());
        
        repositorio.save(usuarioAtualizar);
        
    }

    @Override
    public void remover(String nome) throws UsuarioInexistenteException {
        Usuario usuarioAtualizar = repositorio.findByNome(nome);
        
        if(usuarioAtualizar == null)
            throw new UsuarioInexistenteException();
        repositorio.delete(usuarioAtualizar);
        
    }

    @Override
    public List<Usuario> listarTodos() {
        return (List<Usuario>) repositorio.findAll();
        
    }
    
}
