package br.com.fiap.tds2ps.spring_mvc.service;

import br.com.fiap.tds2ps.spring_mvc.dao.ConsultaDao;
import br.com.fiap.tds2ps.spring_mvc.model.Consulta;
import br.com.fiap.tds2ps.spring_mvc.model.Paciente;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ConsultaService {

    private final ConsultaDao consultaDao;

    public ConsultaService(ConsultaDao consultaDao) {
        this.consultaDao = consultaDao;
    }

    public Consulta createConsultation(Paciente paciente) {
        Consulta consulta = new Consulta();
        consulta.setPatient(paciente);
        consulta.setDate(LocalDateTime.now());
        return consultaDao.save(consulta);
    }
}
