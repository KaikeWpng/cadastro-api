package br.com.senac.api.services;

import br.com.senac.api.modelos.PedidosItens;
import br.com.senac.api.repositorios.PedidosItensRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidosItensService {

    @Autowired
    private PedidosItensRepositorio pedidosItensRepositorio;

    public List<PedidosItens> listar() {
        return pedidosItensRepositorio.findAll();
    }
}
