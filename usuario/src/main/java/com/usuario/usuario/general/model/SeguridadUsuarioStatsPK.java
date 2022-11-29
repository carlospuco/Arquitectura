package com.usuario.usuario.general.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor

public class SeguridadUsuarioStatsPK {
    @Column(name = "COD_USUARIO", nullable = false)
    private Integer codigoUsuario;
}
