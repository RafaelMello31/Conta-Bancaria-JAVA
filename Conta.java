public class Conta{

  //atributos da classe
  private String nome;
  private String numConta;
  private double saldo;

  // construtor default
  public Conta(){  } 

  //construtor passando parâmetro 
  public Conta(String nome, String numConta, double saldo){
    this.nome = nome;
    this.numConta = numConta;
    this.saldo = saldo; 
  }

  //função para depósito
  public void depositar(double valor){

    if (valor > 0) {
      this.saldo += valor;
    }
  }

  //função para saque
  public void sacar(double valor){

    if (valor > 0 && valor <= this.saldo) {
      this.saldo -= valor;
      
    }
    
  }

  //função para pegar saldo
  public double getSaldo(){

    return this.saldo;
  }


  //função para imprimir os dados do clinte
  public void extrato(){

    System.out.println("Titular:" + " " + this.nome);
    System.out.println("Conta:" + " " + this.numConta);
    System.out.println("Saldo: R$" + " " + this.saldo);
    System.out.println(" ");
  }

  //função de transferencia entre contas
  public void transferencia(Conta destino, double valor){

    if(valor>0 && valor<=this.saldo) {
      this.saldo -= valor;
      destino.saldo += valor;
      System.out.println("Tranferência realizada com sucesso!");
    }
    else {
      System.out.println("Transferência não realizada, saldo insuficiente.");
    }
  }

  
}
