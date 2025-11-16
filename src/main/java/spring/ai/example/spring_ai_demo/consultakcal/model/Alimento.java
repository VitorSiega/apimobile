package spring.ai.example.spring_ai_demo.consultakcal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "alimento")
@Entity
public class Alimento {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, columnDefinition = "VARCHAR(40)")
    private String nome;

    @Column(name = "gramas", nullable = false, columnDefinition = "BIGINT")
    private Float gramas;

    @ManyToOne
    @JoinColumn(name = "cardapio_cliente_id")
    private CardapioCliente cardapioCliente;
}
