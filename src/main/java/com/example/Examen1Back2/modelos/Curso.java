package com.example.Examen1Back2.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
@Entity
public class Curso {
//Como con @Entity definimos la creacion de una tabla esta debe tener un id
    @Id //faltaba la d, con esta creamos el campo de clave primaria
    //luego se le aplica al @id una estrategia de creacion para asignarle un valor
    //la declaracion de @GeneratedValue estaba muy incompleta
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nombre;

    @ManyToOne
    @JoinColumn(name="fk_docente", referencedColumnName = "id")
    @JsonBackReference(value = "docente-curso")
    //Docente docente debia declararse private...
    private Docente docente;

    public Curso() {
    }

    public Curso(Integer id, String nombre, Docente docente) {
        this.id = id;
        this.nombre = nombre;
        //tambien es importate incluir en el constructo la variable docente
        this.docente = docente;
    }
// Faltaron los getter y setter


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

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}
