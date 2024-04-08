package org.bw.Model;

public class Usuario {
    private String id;
    private String tag;
    private String nick;
    private String mencion;
    private String rol;
    private String imagenUrl;
    private int nivel;
    private int tareasEntregadas;
    private double promedio;

    public Usuario(){}

    public Usuario(String id, String tag, String nick, String mencion, String rol, String imagenUrl) {
        this.id = id;
        this.tag = tag;
        this.nick = nick;
        this.mencion = mencion;
        this.rol = rol;
        this.imagenUrl = imagenUrl;
    }

    public Usuario(String id, String tag, String nick, String mencion, String rol, String imagenUrl, int nivel, int tareasEntregadas, double promedio) {
        this.id = id;
        this.tag = tag;
        this.nick = nick;
        this.mencion = mencion;
        this.rol = rol;
        this.imagenUrl = imagenUrl;
        this.nivel = nivel;
        this.tareasEntregadas = tareasEntregadas;
        this.promedio = promedio;
    }

    public String getId() { return this.id; }
    public String getTag() { return this.tag; }
    public String getNick() { return this.nick; }
    public String getMencion() { return this.mencion; }
    public String getRol() { return this.rol; }
    public String getImagenUrl() { return this.imagenUrl; }
    public int getNivel() { return this.nivel; }
    public int getTareasEntregadas() { return this.tareasEntregadas; }
    public double getPromedio() { return this.promedio; }

    public void setId(String id) { this.id = id; }
    public void setTag(String tag) { this.tag = tag; }
    public void setNick(String nick) { this.nick = nick; }
    public void setMencion(String mencion) { this.mencion = mencion; }
    public void setRol(String rol) { this.rol = rol; }
    public void setImagenUrl(String imagenUrl) { this.imagenUrl = imagenUrl; }
    public void setNivel(int nivel) { this.nivel = nivel; }
    public void setTareasEntregadas(int tareasEntregadas) { this.tareasEntregadas = tareasEntregadas; }
    public void setPromedio(double promedio) { this.promedio = promedio; }

    public void addNivel(int plus){ this.nivel += plus; }

    @Override
    public String toString() {
        return "Usuario{\n" +
                "id='" + id + '\n' +
                ", tag='" + tag + '\n' +
                ", nick='" + nick + '\n' +
                ", mencion='" + mencion + '\n' +
                ", rol='" + rol + '\n' +
                ", imagenUrl='" + imagenUrl + '\n' +
                ", nivel=" + nivel +"\n"+
                ", tareasEntregadas=" + tareasEntregadas + "\n" +
                ", promedio=" + promedio +"\n"+
                '}';
    }
}
