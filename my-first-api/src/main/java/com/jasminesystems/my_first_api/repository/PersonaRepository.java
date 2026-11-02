package com.jasminesystems.my_first_api.repository;

import com.jasminesystems.my_first_api.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
