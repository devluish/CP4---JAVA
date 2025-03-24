package br.com.fiap.tds2ps.spring_mvc.service;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository repo;

    public Paciente buscarPorCpf(String cpf) {
        return repo.findById(cpf).orElse(null);
    }

    public void salvar(Paciente p) {
        repo.save(p);
    }
}
