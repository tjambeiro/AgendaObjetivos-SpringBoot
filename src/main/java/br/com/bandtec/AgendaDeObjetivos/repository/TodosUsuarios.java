package br.com.bandtec.AgendaDeObjetivos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.bandtec.AgendaDeObjetivos.domain.Credenciais;
import br.com.bandtec.AgendaDeObjetivos.domain.Usuario;

@Repository
public interface TodosUsuarios extends JpaRepository<Usuario, Long>{

	@Query("select u from Usuario u where u.credenciais = :credenciais")
	Usuario usuarioExiste(@Param("credenciais") Credenciais credenciais);
}
