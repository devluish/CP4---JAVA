package br.com.fiap.tds2ps.spring_mvc.controller;

import br.com.fiap.tds2ps.spring_mvc.dto.PersonDto;
import br.com.fiap.tds2ps.spring_mvc.model.Paciente;
import br.com.fiap.tds2ps.spring_mvc.service.PacienteService;
import br.com.fiap.tds2ps.spring_mvc.service.ConsultaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class ConsultationController {

    private final PacienteService patientService;
    private final ConsultaService consultationService;

    public ConsultationController(PacienteService patientService, ConsultaService consultationService) {
        this.patientService = patientService;
        this.consultationService = consultationService;
    }

    @PostMapping("/consultation/start")
    public ModelAndView start(Model model, @ModelAttribute("patientLazy") PersonDto patientDto) {
        Paciente patient = patientService.findOrCreatePatient(patientDto.getCpf());
        consultationService.createConsultation(patient);
        return new ModelAndView("add-consultation");
    }
}
