package com.usuario.usuario.general.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usuario.usuario.general.model.SeguridadUsuario;

public interface SeguridadUsuarioRepository extends JpaRepository<SeguridadUsuario, Integer> 
{
    List<SeguridadUsuario> findByCodeCountry(Integer codigoUsuario);    
}
