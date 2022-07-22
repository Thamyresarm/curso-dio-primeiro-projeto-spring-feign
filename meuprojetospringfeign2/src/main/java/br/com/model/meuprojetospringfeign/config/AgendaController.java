package br.com.model.meuprojetospringfeign.config;

import br.com.model.meuprojetospringfeign.ConsumindoApi;
import br.com.model.meuprojetospringfeign.Contato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("agenda")
public class AgendaController {

    @Autowired
    private ConsumindoApi consumindoApi;

    @GetMapping
    public Contato retornaContato() {
        return consumindoApi.retornaContato();
    }
}
