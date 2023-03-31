package com.demospring.demo.entities;
        import jakarta.persistence.Column;
        import jakarta.persistence.Entity;
        import jakarta.persistence.GeneratedValue;
        import jakarta.persistence.GenerationType;
        import jakarta.persistence.Id;
        import jakarta.persistence.Table;
@Entity
@Table(name="Usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private int id;
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Column(name = "password", nullable = false, length = 100)
    private String password;
    @Column(name = "email", nullable = false, length = 100)
    private String email;



    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", password=" + password + ", email=" + email + "]";
    }
    public Usuario(int id, String nombre, String password, String email) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.email = email;
    }
    public Usuario() {
        // TODO Auto-generated constructor stub
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
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

}
