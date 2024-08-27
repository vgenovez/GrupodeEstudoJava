package prinpOOHerancaPolimorfismo;
public class ContaBancaria {
    private Integer numeroConta;
    private Double saldo;
    private String titular;
    
    public ContaBancaria(Integer numeroConta, Double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public void depositar(Double valor) {
        this.saldo += valor;
    }
    
    public void sacar(Double valor) {
        if (valor > this.saldo) {
           System.out.println("Saldo insuficiente!");
           return;
        }
        this.saldo -= valor;
    }
    
    public String toString() {
        return "{ numeroConta: " + numeroConta + ", titular: " + titular + ", saldo: " + saldo + " }";
    }
}