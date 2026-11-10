package br.com.Juan_J0rge.repository;

import br.com.Juan_J0rge.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
