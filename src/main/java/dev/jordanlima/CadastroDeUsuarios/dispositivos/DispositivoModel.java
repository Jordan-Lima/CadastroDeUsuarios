package dev.jordanlima.CadastroDeUsuarios.dispositivos;

import dev.jordanlima.CadastroDeUsuarios.usuarios.UsuarioModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "TB_DEVICE")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class DispositivoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mac;
    private String type;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UsuarioModel usuario;
}
