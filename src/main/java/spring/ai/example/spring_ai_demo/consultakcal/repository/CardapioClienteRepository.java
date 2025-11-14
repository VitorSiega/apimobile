package spring.ai.example.spring_ai_demo.consultakcal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.ai.example.spring_ai_demo.consultakcal.model.CardapioCliente;

@Repository
public interface CardapioClienteRepository extends JpaRepository<CardapioCliente, Long> {
}
