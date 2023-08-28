package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import domain.enumerate.Perfil;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Tecnico  extends Pessoa implements Serializable{
    private static final long serialVersionUID = 1L;

    @OneToMany(mappedBy = "tecnico")
    private List<Chamados> chamados = new ArrayList<>();

    public Tecnico() {
       super();
       addPerfil(Perfil.TECNICO);
    }

    public Tecnico(Integer id, String nome, String cpf, String email, String senha, List<Chamados> chamados) {
        super(id, nome, cpf, email, senha);
       addPerfil(Perfil.TECNICO);
    }

    public List<Chamados> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamados> chamados) {
        this.chamados = chamados;
    }

    
        
}

