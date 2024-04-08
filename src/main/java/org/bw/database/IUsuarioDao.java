package org.bw.database;

import org.bw.Model.Usuario;

import java.util.List;

public interface IUsuarioDao {

    public List<Usuario> listar();

    public Usuario encontrar(Usuario usuario);

    public int insertar(Usuario usuario);

    public int actualizar(Usuario usuario);

    public int eliminar(Usuario usuario);

}

