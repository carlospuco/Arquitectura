package com.usuario.usuario.general.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "SEG_USUARIO")
public class SeguridadUsuario {
    @Id
    @EqualsAndHashCode.Include
    @Column(name = "COD_USUARIO", nullable = false)
    private Integer codigoUsuario;
    @Column(name = "USERNAME", length = 32, nullable = false)
    private String nombreUsuario;
    @Column(name = "NOMBRE", length = 32, nullable = false)
    private String nombre;
    @Column(name = "MAIL", length = 128, nullable = false)
    private String mail;
    @Column(name = "ESTADO", length = 3, nullable = false)
    private String estado;
    @Column(name = "CLAVE", length = 64, nullable = false)
    private String clave;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CREACION", nullable = false)
    private Date fechaCreacion;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_MODIFICACION", nullable = false)
    private Date fechaModificaciob;
    @Column(name = "ROL", length = 5, nullable = false)
    private String rol;









    
}
