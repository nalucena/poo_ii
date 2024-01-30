package br.com.ada.pooii.aula1.ex2;

public class Main {

    public static void main(String[] args) {

        /*Funcionario func = new Funcionario("Jorge", 1200);
        System.out.println(func.getBonus());*/

        Vendedor vendedor = new Vendedor("Jorge", 1000);
        Funcionario gerente = new Gerente("Maria", 2000);

        autentica(vendedor, vendedor.getSenha());


        System.out.println(vendedor.getBonus());
        System.out.println(gerente.getBonus());
    }

    public static void autentica (Autentica a, String senha) {
        a.autenticaDefault(senha);
        if (a.autentica(senha)){
            System.out.println("autenticado");
            } else {
            System.out.println("Não autenticado");

        }

    }
}

