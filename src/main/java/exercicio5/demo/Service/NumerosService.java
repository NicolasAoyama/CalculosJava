package exercicio5.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class NumerosService {
    @Autowired
    private NumerosService Repository;
    public List<Numeros> listartudo(){
        return Repository.findAll();
    }
    @Transactional(rollbackFor = Exception.class)
    public Pessoa cadastrar(Numeros cadastrar) {
        return this.Repository.save(cadastrar);
    }

    @Transactional(rollbackFor = Exception.class)
    public void atualizar(Long id, Numeros atualizar) { this.Repository.save(atualizar);
    }

}
