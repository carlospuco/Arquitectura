package com.usuario.usuario.general.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "location_entity")
@Data
@NoArgsConstructor
public class SeguridadUsuarioStats {
    @EmbeddedId
    private SeguridadUsuarioStatsPK pk;
    @Column(name = "TOTAL_SESIONES", nullable = false)
    private BigDecimal totalSesiones;

    @Column(name = "INTENTOS_FALLIDOS", nullable = false)
    private BigDecimal intentosFallidos;

    @Column(name = "TOTAL_INTENTOS_FALLIDOS", nullable = false)
    private BigDecimal totalIntentosFallidos;

    @Temporal(TemporalType.DATE)
    @Column(name = "ULTIMO_INTENTO_FALLIDO", nullable = false)
    private Date ultimoIntentoFallido;
}
