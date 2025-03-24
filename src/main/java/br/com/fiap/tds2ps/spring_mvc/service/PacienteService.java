package br.com.fiap.tds2ps.spring_mvc.service;

import br.com.fiap.tds2ps.spring_mvc.model.Paciente;
import br.com.fiap.tds2ps.spring_mvc.dao.PacienteDao;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {

    private final PacienteDao patientRepository;

    public PacienteService(PacienteDao patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Paciente findOrCreatePatient(String cpf) {
        return patientRepository.findByCpf(cpf).orElseGet(() -> {
            Paciente newPatient = new Paciente();
            newPatient.setCpf(cpf);
            return patientRepository.save(newPatient);
        });
    }
}
