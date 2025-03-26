package dev.jordanlima.CadastroDeUsuarios.usuarios;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@AllArgsConstructor
public class UsuarioController {

    @Autowired
    private final UsuarioService usuarioService;

    @PostMapping("/register")
    public UsuarioModel create(@RequestBody UsuarioModel usuarioModel) { return  usuarioService.save(usuarioModel);}

    @GetMapping("/users")
    public List<UsuarioModel> getAll() { return usuarioService.getAll(); }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id) {usuarioService.delete(id);
    }
}
