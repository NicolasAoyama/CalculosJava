package exercicio5.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Numeropository extends JpaRepository<Numero, Long> {
    List<Numero> findByAtivo(boolean ativo);
}
