package br.com.bandtec.AgendaDeObjetivos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import br.com.bandtec.AgendaDeObjetivos.domain.Evento;

@Repository
public interface Eventos extends JpaRepository<Evento, Long> {

	@Query("select e from evento e")
	List<Evento> FindEvento();
}
