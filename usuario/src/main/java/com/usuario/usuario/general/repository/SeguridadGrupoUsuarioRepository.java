package com.usuario.usuario.general.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usuario.usuario.general.model.SeguridadGrupoUsuario;
import com.usuario.usuario.general.model.SeguridadUsuario;

public interface SeguridadGrupoUsuarioRepository extends JpaRepository<SeguridadGrupoUsuario, Integer> 
{
    List<SeguridadGrupoUsuario> findByCodeCountry(Integer codigoGrupo);    
}
