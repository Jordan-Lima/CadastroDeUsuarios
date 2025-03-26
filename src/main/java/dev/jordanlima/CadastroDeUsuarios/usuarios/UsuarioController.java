package dev.jordanlima.CadastroDeUsuarios.usuarios;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UsuarioController {
    @GetMapping("/register")
    public String cadastroResponse() {
        return "<h1 align='center'>Cadastro!</h1>";
    }
    @GetMapping("/users")
    public String usuariosResponse() {
        return "<h1 align='center'>Usuários!</h1>";
    }
    @GetMapping("/login")
    public String loginResponse() {
        return "<h1 align='center'>Login!</h1>";
    }
}
