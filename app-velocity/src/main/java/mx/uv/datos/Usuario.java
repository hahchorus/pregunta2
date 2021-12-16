package mx.uv.datos;

public class Usuario {
    private String id;
    private String nombre;
    private String email;
    private String password;

    public Usuario(String id, String nombre, String email, String password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.id = id;
    }
    
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setId(String id) {
        this.id = id;
    }
}
