package conta;

public class Conta {
	//ATRIBUTOS
	protected String nomeTitular;
	protected int numero;
	protected String agencia;
	protected double saldo;
	protected Data dataAbertura;

	//METODOS
	//SACA UM DETERMINADO VALOR DA CONTA
	void sacar(double valor) {
		this.saldo = saldo - valor;
	}
	//ADICIONA UM DEPOSITO NA CONTA
	void depositar(double valor) {
		this.saldo = saldo + valor;
	}
	//CALCULAR O RENDIMENTO
	double calculaRendimento() {
		double rendimento = saldo * 0.01;
		return rendimento;
	}
	//MOSTRA OS DADOS DO TITULAR DA CONTA
	String recuperaDadoParaImpressao(){
		String dados = "nome: "+ this.nomeTitular;
		dados += "\nAgencia: " + this.agencia;
		dados += "\nNumero Conta: " + this.numero;
		dados += "\nSaldo: " + this.saldo;

		dados += "\nData de Abertura: " + this.dataAbertura.format();
		return dados;
	}	

}

