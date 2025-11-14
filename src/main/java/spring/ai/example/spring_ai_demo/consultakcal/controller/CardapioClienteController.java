package spring.ai.example.spring_ai_demo.consultakcal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import spring.ai.example.spring_ai_demo.consultakcal.dto.CardapioClienteDTO;
import spring.ai.example.spring_ai_demo.consultakcal.service.CardapioClienteService;

@Controller
public class CardapioClienteController {

    private final CardapioClienteService cardapioClienteService;

    public CardapioClienteController(CardapioClienteService cardapioClienteService) {
        this.cardapioClienteService = cardapioClienteService;
    }

    @PostMapping("/cadastrar/cardapio")
    public ResponseEntity<?> salvarCardapio(@RequestBody CardapioClienteDTO cardapioClienteDTO) {
        cardapioClienteService.salvarCardapio(cardapioClienteDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
