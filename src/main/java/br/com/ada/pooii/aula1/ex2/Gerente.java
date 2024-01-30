package br.com.ada.pooii.aula1.ex2;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.salario * 0.3;
    }

    @Override
    public int compareTo(Gerente o){
        return Double.compare(this.getBonus(), o.getBonus());
    }

    @Override
    public String toString(){
        return this.nome + ": salario: " + this.salario + " bonus: " + this.getBonus();
    }
}

