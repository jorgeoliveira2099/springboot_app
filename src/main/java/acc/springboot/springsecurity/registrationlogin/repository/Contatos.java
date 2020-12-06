package acc.springboot.springsecurity.registrationlogin.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import acc.springboot.springsecurity.registrationlogin.model.Contato;

public interface Contatos extends JpaRepository<Contato, Long> {

}
