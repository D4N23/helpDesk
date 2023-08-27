package domain;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    
    private List<Chamados> chamados = new ArrayList<>();

    public Cliente(List<Chamados> chamados) {
        // this.chamados = chamados;
    }

    public Cliente(Integer id, String nome, String cpf, String email, String senha, List<Chamados> chamados) {
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
