package domain;

import java.util.ArrayList;
import java.util.List;

public class Tecnico  extends Pessoa{

    private List<Chamados> chamados = new ArrayList<>();

    public Tecnico(List<Chamados> chamados) {
        // this.chamados = chamados;
    }

    public Tecnico(Integer id, String nome, String cpf, String email, String senha, List<Chamados> chamados) {
        super(id, nome, cpf, email, senha);
        // this.chamados = chamados;
    }

    public List<Chamados> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamados> chamados) {
        this.chamados = chamados;
    }

    
        
}

