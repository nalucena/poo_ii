package br.com.ada.pooii.aula1.ex2;

public class Cliente implements Autentica {

    private String senha;
    @Override
    public boolean autentica(String senha) {
        return autenticaDefault(senha);
    }
}
