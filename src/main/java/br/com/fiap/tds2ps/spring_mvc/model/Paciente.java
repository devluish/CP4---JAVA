package br.com.fiap.tds2ps.spring_mvc.model;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@Entity
public class Paciente {
    @Id
    private String cpf;
    private String nome;
    private LocalDate nascimento;
    // getters/setters
}