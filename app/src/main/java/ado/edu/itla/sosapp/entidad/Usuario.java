package ado.edu.itla.sosapp.entidad;

public class Usuario {

    public int id;
    private int edad;
    private String nombre;
    private String password;
    private String email;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
//
//    public int getEdad() {
//        return edad;
//    }
//
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public void setEdad(int edad) {
//        if (edad < 0 || edad > 130) {
//
//            throw new RuntimeException("Error: Edad no permitida.");
//        }
//        this.edad = edad;
//    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}