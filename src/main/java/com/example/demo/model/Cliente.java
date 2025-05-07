package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity
@Table(name = "clientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id")
    private Long id;

    @Column(name = "nombre_cliente", nullable = false)
    private String nombre;

    @Column(name = "correo_cliente", unique = true)
    private String email;

    @OneToMany(mappedBy = "cliente")
    private Set<Venta> ventas;
}