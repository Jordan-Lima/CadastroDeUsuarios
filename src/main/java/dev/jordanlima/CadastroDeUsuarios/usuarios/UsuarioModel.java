package dev.jordanlima.CadastroDeUsuarios.usuarios;

import dev.jordanlima.CadastroDeUsuarios.dispositivos.DispositivoModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "TB_REGISTER")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;

    @OneToMany(mappedBy = "usuario")
    private List<DispositivoModel> dispositivos;

}