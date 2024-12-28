package com.aluracursos.literalura.model;

import com.aluracursos.literalura.datamodel.DatosLibro;
import jakarta.persistence.*;

import java.util.stream.Collectors;

@Entity
@Table(name="libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    private String titulo;
    @Enumerated(EnumType.STRING)
    private Idioma idioma;
    private double numeroDeDescargas;
    @ManyToOne
    private Autor autor;

    public Libro(){

    }

    public Libro (DatosLibro datosLibro){
        this.titulo = datosLibro.titulo();
        this.idioma = Idioma.fromString(datosLibro.idiomas().stream()
                .limit(1).collect(Collectors.joining()));
        this.numeroDeDescargas = datosLibro.numeroDeDescargas();

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public double getNumeroDeDescargas() {
        return numeroDeDescargas;
    }

    public void setNumeroDeDescargas(double numeroDeDescargas) {
        this.numeroDeDescargas = numeroDeDescargas;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "--------------- LIBRO ------------------" +
                "\nTítulo: " + titulo +
                "\nAutor: " + getAutor().getNombre() +
                "\nIdioma: " + idioma +
                "\nNúmero de descargas: " + numeroDeDescargas +
                "\n----------------------------------------\n";
    }
}
