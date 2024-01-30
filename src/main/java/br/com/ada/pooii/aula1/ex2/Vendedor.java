package br.com.ada.pooii.aula1.ex2;

import br.com.ada.pooii.aula1.ex2.Autentica;
import br.com.ada.pooii.aula1.ex2.Funcionario;

public class Vendedor extends Funcionario implements Autentica {

    private String senha;
    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public double getBonus(){
        return this.salario * 0.2;
    }

    @Override
    public boolean autentica(String senha) {
        return this.senha.equals(senha);
    }

    public String getSenha() {
        return senha;
    }

}
