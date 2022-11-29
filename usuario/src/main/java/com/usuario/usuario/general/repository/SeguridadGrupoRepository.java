package com.usuario.usuario.general.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SeguridadGrupoRepository extends JpaRepository<SeguridadGrupo, Integer> 
{
    List<SeguridadGrupo> findByCodeCountry(Integer codigoGrupo);    
}

