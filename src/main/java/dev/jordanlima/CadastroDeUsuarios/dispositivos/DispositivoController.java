package dev.jordanlima.CadastroDeUsuarios.dispositivos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DispositivoController {
    @GetMapping("/devices")
    public String devicesResponse() {return "<h1 align='center'>Devices</h1>";}
}
