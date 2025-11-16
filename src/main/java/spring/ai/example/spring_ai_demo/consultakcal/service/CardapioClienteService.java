package spring.ai.example.spring_ai_demo.consultakcal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.ai.example.spring_ai_demo.consultakcal.dto.CardapioClienteDTO;
import spring.ai.example.spring_ai_demo.consultakcal.model.Alimento;
import spring.ai.example.spring_ai_demo.consultakcal.model.CardapioCliente;
import spring.ai.example.spring_ai_demo.consultakcal.repository.CardapioClienteRepository;

@Service
public class CardapioClienteService {

        @Autowired
        private CardapioClienteRepository cardapioClienteRepository;

        public void salvarCardapio(CardapioClienteDTO cardapioClienteDTO) {
                CardapioCliente cardapioCliente = CardapioCliente.builder()
                                .listaAlimentos(new ArrayList<>())
                                .build();

                List<Alimento> alimentos = cardapioClienteDTO.alimentos().stream()
                                .map(a -> Alimento.builder()
                                                .nome(a.nome())
                                                .gramas(a.gramas())
                                                .cardapioCliente(cardapioCliente)
                                                .build())
                                .toList();

                cardapioCliente.setListaAlimentos(alimentos);
                cardapioClienteRepository.save(cardapioCliente);

        }

}
