package com.application.restfull.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Producto")
public class Product  extends Auditoria{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tipo_producto")
    private String typeProduct;
    @Column (name = "numero_producto")
    private Long numberProduct;
    @Column (name = "nombre_producto")
    private String nameProduct;
    @Column (name = "sucursal_producto")
    private String branchProduct;
    @Column (name = "saldo_producto")
    private BigDecimal balanceProduct;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    @JsonIgnore
    private Client client;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JsonIgnore
    private List<Pqrs> pqrsList = new ArrayList<>();
}
