package com.platzimarket.persistence.entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="compras")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_compra")
    private Integer idCompra;
    @Column(name="id_cliente")
    private Integer idCliente;
    private LocalDateTime fecha;
    @Column(name = "medio_pago")
    private Character medioPago;
    private String comentario;
    private Boolean estado;
    @ManyToOne
    @JoinColumn(name = "id_cliente", updatable = false, insertable = false)
    private Cliente cliente;
    @OneToMany(mappedBy = "compra")
    private List<ComprasProducto>  compras;

    public Integer getIdCompra() {
        return idCompra;
    }
    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }
    public Integer getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public Character getMedioPago() {
        return medioPago;
    }
    public void setMedioPago(Character medioPago) {
        this.medioPago = medioPago;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public Boolean getEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
