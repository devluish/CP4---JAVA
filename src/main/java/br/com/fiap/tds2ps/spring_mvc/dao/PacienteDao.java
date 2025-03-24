package br.com.fiap.tds2ps.spring_mvc.dao;

import br.com.fiap.tds2ps.spring_mvc.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface PacienteDao extends JpaRepository<Paciente, String> {
    Optional<Paciente> findByCpf(String cpf);
}