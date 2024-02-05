import java.util.Random;

public class ContaBancaria {
    // atributos privados
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria (){
        this.numeroConta = 999;
        this.nomeTitular = "";
        this.saldo = 0.0;
    }



    //método para depositar dinheiro
    public void depositar (double valor){
        saldo = saldo + valor;
        System.out.println("Depósito de " + valor + "€ realizado com sucesso.");
    }
    //método para levantar dinheiro
    public void levantar (double valor1) {
        if (valor1 > saldo){
            System.out.println("Saldo insuficiente para realizar a operação.");
        }else {
            saldo = saldo - valor1;
            System.out.println("Levantamento de " + valor1 + "€ realizado com sucesso.");
        }

    }
    //método para verificar o saldo
    public double verificarSaldo (){
        return saldo;
    }
    //métodos publicos para aceder e modificar o número de conta e o nome do titular
    public int getNumeroConta(){
       return numeroConta;
    }
    public void setNumeroConta(int numeroConta){
        /*this.numeroConta = numeroConta;*/
        Random random = new Random();
        this.numeroConta = random.nextInt();
    }
    public String getNomeTitular(){
       return nomeTitular;
    }
    public void setNomeTitular (String nomeTitular){
        this.nomeTitular = nomeTitular;
    }
    public void info (){//método info de conta

        System.out.println("Conta N " + getNumeroConta() + ", com o titular " + getNomeTitular() + ", com saldo de: " + verificarSaldo()+ "€ ");
    }
}



