package org.bw.database;

import org.bw.Model.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao implements IUsuarioDao{

    private static final String SQL_SELECT_ALL = "SELECT * FROM usuario";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM usuario WHERE id = ?";
    private static final String SQL_INSERT = "INSERT INTO usuario(id, tag, nick, mencion, rol, imagenUrl, nivel, tareasEntregadas, promedio) VALUES (?,?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET tag = ?, nick = ?, mencion = ?, rol = ?, imagenUrl = ?, nivel = ?, tareasEntregadas = ?, promedio = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id = ?";

    public List<Usuario> listar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_ALL);
            rs = stmt.executeQuery();

            while (rs.next()) {
                String id = rs.getString("id");
                String tag = rs.getString("tag");
                String nick = rs.getString("nick");
                String mencion = rs.getString("mencion");
                String rol = rs.getString("rol");
                String imagenUrl = rs.getString("imagenUrl");
                int nivel = rs.getInt("nivel");
                int tareasEntregadas = rs.getInt("tareasEntregadas");
                double promedio = rs.getDouble("promedio");

                usuario = new Usuario();
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return usuarios;
    }

    public Usuario encontrar(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            stmt.setString(1, usuario.getId());
            rs = stmt.executeQuery();
            rs.next();

            String tag = rs.getString("tag");
            String nick = rs.getString("nick");
            String mencion = rs.getString("mencion");
            String rol = rs.getString("rol");
            String imagenUrl = rs.getString("imagenUrl");
            int nivel = rs.getInt("nivel");
            int tareasEntregadas = rs.getInt("tareasEntregadas");
            double promedio = rs.getDouble("promedio");

            usuario.setTag(tag);
            usuario.setNick(nick);
            usuario.setMencion(mencion);
            usuario.setRol(rol);
            usuario.setImagenUrl(imagenUrl);
            usuario.setNivel(nivel);
            usuario.setTareasEntregadas(tareasEntregadas);
            usuario.setPromedio(promedio);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return usuario;
    }

    public int insertar(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, usuario.getId());
            stmt.setString(2, usuario.getTag());
            stmt.setString(3, usuario.getNick());
            stmt.setString(4, usuario.getMencion());
            stmt.setString(5, usuario.getRol());
            stmt.setString(6, usuario.getImagenUrl());
            stmt.setInt(7, usuario.getNivel());
            stmt.setInt(8, usuario.getTareasEntregadas());
            stmt.setDouble(9, usuario.getPromedio());
            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int actualizar(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);

            stmt.setString(1, usuario.getTag());
            stmt.setString(2, usuario.getNick());
            stmt.setString(3, usuario.getMencion());
            stmt.setString(4, usuario.getRol());
            stmt.setString(5, usuario.getImagenUrl());
            stmt.setInt(6, usuario.getNivel());
            stmt.setInt(7, usuario.getTareasEntregadas());
            stmt.setDouble(8, usuario.getPromedio());
            stmt.setString(9, usuario.getId());
            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int eliminar(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);

            stmt.setString(1, usuario.getId());
            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

}
