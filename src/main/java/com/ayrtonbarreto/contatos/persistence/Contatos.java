package com.ayrtonbarreto.contatos.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayrtonbarreto.contatos.domain.Contato;

public interface Contatos extends JpaRepository<Contato, Long> {

}
