package br.com.senac.api.controllers;

import br.com.senac.api.controllers.dtos.PedidosItensRequestDTO;
import br.com.senac.api.modelos.PedidosItens;
import br.com.senac.api.services.PedidosItensService;
import br.com.senac.api.services.PedidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class PedidosItensController {

    @Autowired
    private PedidosItensService pedidosItensService;

    @GetMapping("/listar")
    public ResponseEntity<List<PedidosItens>> listar() {
        return ResponseEntity.ok(pedidosItensService.listar());
    }

    @PostMapping("/criar")
    public ResponseEntity<?> criar(@RequestBody PedidosItensRequestDTO pedido){

    }

}
