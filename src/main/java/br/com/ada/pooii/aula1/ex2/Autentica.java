package br.com.ada.pooii.aula1.ex2;

public interface Autentica {
    boolean autentica(String senha);

    //default

    default boolean autenticaDefault(String senha){  //a partir do java 8
        return senha.equals("123");
    }

    static boolean autenticaStatic(String senha){
        return senha.equals("123");
    }
}

// Colocar que é abstract ou final é reduntante, porque todos os métodos na interface são abstract final.

// Também é possível ter um método private, mas ele apenas pode ser usado na interface, assim como o estático