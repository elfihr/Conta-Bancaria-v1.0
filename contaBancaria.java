public class contaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;
 public String getTitular() {
     return titular;
 }
 public void setTitular(String titular) {
     this.titular = titular;
 }
 public int getNumeroConta() {
     return numeroConta;
 }
 public void setNumeroConta(int numeroConta) {
     this.numeroConta = numeroConta;
 }
 public double getSaldo() {
     return saldo;
 }
 public void setSaldo(double saldo) {
     this.saldo = saldo;
 }
    
 public void sacar(double valor){
 if (getSaldo ()> valor) {
     saldo -= valor;
     System.out.println("Seu Saldo atual é: " + getSaldo());
 }
 else{
     System.out.println("Saldo Insuficiente");
     System.out.println("Seu Saldo atual é: " + getSaldo());
 }
 }
 public void depositar(double valor){
 saldo += valor;
 System.out.println("Seu Saldo atual é: " + getSaldo());
 }
 public void transferir(double valor, String conta){
     if (getSaldo ()> valor) {
         saldo -= valor;
         System.out.println("Seu Saldo atual é: " + getSaldo());
     }
     else{
         System.out.println("Saldo Insuficiente");
         System.out.println("Seu Saldo atual é: " + getSaldo());
     }
 }
 }
 