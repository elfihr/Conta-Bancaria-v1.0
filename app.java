public class app {
    
    public static void main(String[] args) throws Exception {

        contaBancaria conta1 = new contaBancaria();
        contaBancaria conta2 = new contaBancaria();

        conta1.setTitular("Anita");
        conta1.setNumeroConta(0001);
        conta1.setSaldo(1000);

        conta1.setTitular("Aloke");
        conta1.setNumeroConta(0002);
        conta1.setSaldo(500);

        conta1.depositar(500);
        conta1.sacar(50);
        conta1.transferir(1000, "Anita");
        conta2.depositar(2000);
    }
}
