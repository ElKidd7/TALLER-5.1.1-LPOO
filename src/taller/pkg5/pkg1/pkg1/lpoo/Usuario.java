
package taller.pkg5.pkg1.pkg1.lpoo;

public class Usuario {
    private int usuarioID;
    private String nombre;
    private String email;
    private String password;
    private String fotoPerfil;

    // Constructor
    public Usuario(int usuarioID, String nombre, String email, String password, String fotoPerfil) {
        this.usuarioID = usuarioID;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.fotoPerfil = fotoPerfil;
    }

    // Getters y Setters
    public int getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }
}
