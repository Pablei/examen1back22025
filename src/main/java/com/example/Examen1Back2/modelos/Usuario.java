package com.example.Examen1Back2.modelos;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity //faltaba l 'y'
@Table(name = "usuarios")
public class Usuario {
    @Id
    //Faltaba añadir IDENTITY a generatedValue
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Mal escrita @Column. Se corrigio
    @Column(name = "id_usuario")
    private Integer id;

    @Column(nullable = false, length = 100)
    private String nombre;
    //Mal escrita @Column. Se corrigio
    @Column(name = "correo_electronico", unique = true)
    private String correoElectronico;
    //es recomendado no usar la Ñ
    private String contrasena;
    private String telefono;

    @Enumerated(EnumType.STRING)
    //Debia crearse el archivo enum para que sea leido por la variable
    private TipoUsuario tipoUsuario;

    //Estableciendo la relacion uno a uno con la tabla docente
    @OneToOne(mappedBy = "usuario")
    @JsonBackReference(value = "docente-usuario")
    private Docente docente;

    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String correoElectronico, String contrasena, String telefono, TipoUsuario tipoUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.telefono = telefono;
        this.tipoUsuario = tipoUsuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}