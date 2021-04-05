package com.egaliteSiX.beequalite.repository;

import java.util.List;

import com.egaliteSiX.beequalite.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
    public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);

    public List<Usuario> findAllByEmailContainingIgnoreCase(String email);
}