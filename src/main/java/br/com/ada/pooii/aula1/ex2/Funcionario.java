package br.com.ada.pooii.aula1.ex2;

public abstract class Funcionario {

    protected String nome;
    protected double salario;
    // private String cargo;  // 1 - vendedor; 2 - gerente

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        // this.cargo = cargo;
    }

    public abstract double getBonus();

    public abstract int compareTo(Gerente o);
}

    /*public double getBonus() {

        double resultado = 0.0;

        if (this.cargo.equals("vendedor")) {    //se não sobrescrever o equals, vai herdar de object
            resultado = this.salario * 0.2;
        } else if (this.cargo.equals("gerente")) {    //Na String, pode usar o equalsIgnoreCase para ignorar a formatação;
            resultado = this.salario * 0.3;

        }
        return resultado;
    }

}*/
