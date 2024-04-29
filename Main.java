public class Main {

  public static void main(String[] args){

    Conta c1 = new Conta("Rafael Mello", "123456", 10000.00);
    c1.depositar(2000.00);
    c1.sacar(1000.00);
    c1.getSaldo();
    c1.extrato();

    Conta c2 = new Conta("Leonardo Mello", "7891011", 9000.00);
    c2.depositar(2000.00);
    c2.sacar(1000.00);
    c2.getSaldo();
    c2.extrato();

    Conta destino = c2;
    destino.extrato();

    c1.transferencia(destino, 1000.00);

    destino.extrato();
       
  }
 
}
