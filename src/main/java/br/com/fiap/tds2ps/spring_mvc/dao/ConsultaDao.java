package br.com.fiap.tds2ps.spring_mvc.dao;

import br.com.fiap.tds2ps.spring_mvc.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaDao extends JpaRepository<Consulta, Long> {
}
