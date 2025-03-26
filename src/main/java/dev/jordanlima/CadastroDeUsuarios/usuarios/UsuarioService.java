package dev.jordanlima.CadastroDeUsuarios.usuarios;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    //Listar os usuários
    public List<UsuarioModel> getAll() {
        return usuarioRepository.findAll();
    }

    //Salvar usuário
    public UsuarioModel save(UsuarioModel usuarioModel) { return usuarioRepository.save(usuarioModel); }

    //Deletar Usuário
    public void delete(Long id) {usuarioRepository.deleteById(id);}
}