package config;

import models.User;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kapx3
 */
public class ConexionDB4O {

    private ObjectContainer db = null;

    private void abrirConexion() {
        db = Db4oEmbedded.openFile("usuario");
    }

    private void cerrarConexion() {
        db.close();
    }

    public void insertarUsuario(User usuario) {
        abrirConexion();
        db.store(usuario);
        cerrarConexion();
    }

    public List<User> seleccionarTodosUsuarios() {
        abrirConexion();
        ObjectSet listaUsuariosDB = db.queryByExample(User.class);
        List<User> listaUsuarios = new ArrayList<>();
        listaUsuariosDB.forEach((usuarios) -> {
            listaUsuarios.add((User) usuarios);
        });
        cerrarConexion();
        return listaUsuarios;
    }

    public User seleccionarUsuario(User usuario) {
        abrirConexion();
        ObjectSet resultado = db.queryByExample(usuario);
        User usuarioEncontrado = (User) resultado.next();
        cerrarConexion();
        return usuarioEncontrado;
    }

    public void actualizarUsuario(int id,
            String nuevoNombre,
            String nuevoAlias,
            int nuevaEdad,
            String nuevaColonia,
            String nuevaCalle,
            int nuevoNo_Ext,
            String nuevoNo_Int,
            int nuevoCP,
            int nuevoContacto,
            String nuevaComunidad) {
        abrirConexion();
        User usuario = new User();
        usuario.setId(id);
        ObjectSet resultado = db.queryByExample(usuario);
        User usuarioActualizar = (User) resultado.next();
        usuarioActualizar.setNombre(nuevoNombre);
        usuarioActualizar.setAlias(nuevoAlias);
        usuarioActualizar.setEdad(nuevaEdad);
        usuarioActualizar.setColonia(nuevaColonia);
        usuarioActualizar.setCalle(nuevaCalle);
        usuarioActualizar.setNo_Ext(nuevoNo_Ext);
        usuarioActualizar.setNo_Int(nuevoNo_Int);
        usuarioActualizar.setCP(nuevoCP);
        usuarioActualizar.setContacto(nuevoContacto);
        usuarioActualizar.setComunidad(nuevaComunidad);
        cerrarConexion();
    }

    public void eliminarUsuario(int id) {
        abrirConexion();
        User usuario = new User();
        usuario.setId(id);
        ObjectSet resultado = db.queryByExample(usuario);
        User usuarioEliminar = (User) resultado.next();
        db.delete(usuarioEliminar);
        cerrarConexion();
    }
}
