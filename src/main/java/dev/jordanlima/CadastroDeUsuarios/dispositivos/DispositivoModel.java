package dev.jordanlima.CadastroDeUsuarios.dispositivos;

import dev.jordanlima.CadastroDeUsuarios.usuarios.UsuarioModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "TB_DEVICE")
public class DispositivoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mac;
    private String type;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private List<UsuarioModel> usuario;
}
