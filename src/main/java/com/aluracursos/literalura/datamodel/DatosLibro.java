package com.aluracursos.literalura.datamodel;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public record DatosLibros(@JsonAlias("title") String titulo,
                          @JsonAlias("authors") List<DatosAutor> autor,
                          @JsonAlias("languages") List<String> idiomas,
                          @JsonAlias("download_count") double numeroDeDescargas) {
}
