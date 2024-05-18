public class Banco { 
    private String nome;
    private double saldo = 0;

    
   
    public String getNome() {
        return "Bem vindo "+nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){

        saldo -= valor;
    }

    public void depositar(double valor){
       saldo += valor;
    }


}