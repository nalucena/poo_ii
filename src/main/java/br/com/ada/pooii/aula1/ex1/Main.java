package br.com.ada.pooii.aula1.ex1;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     ContaCorrente cc = new ContaCorrente();
     cc.depositar(10.0);

        System.out.println(cc.getSaldo());
    }
}
abstract class Conta {     // Não é indicado criar mais de uma classe no mesmo arquivo
    protected String titular;  //Se continuasse private, as classes filhas não poderiam acessar
    protected double saldo = 0.00;

    abstract void depositar (double valor);
    abstract void sacar (double valor);

    public double getSaldo(){
        return saldo;
    }

}

class ContaCorrente extends Conta {

    @Override
    void depositar (double valor){
        this.saldo += valor * 0.95;   // Funciona usar o super também, mas ele significa que está usando o atributo na classe pai e o this na instância.
    }
    @Override
    void sacar (double valor){
        this.saldo -= valor;
    }
}
