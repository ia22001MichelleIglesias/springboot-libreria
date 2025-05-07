package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity
@Table(name = "autores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "autor_id")
    private Long id;

    @Column(name = "nombre_autor", nullable = false)
    private String nombre;

    @Column(name = "correo_autor", unique = true)
    private String email;

    @ManyToMany(mappedBy = "autores")
    private Set<Libro> libros;
}