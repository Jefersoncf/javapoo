package conta;

public class TesteConta {

	public static void main(String[] args) {

		//CRIANDO O OBJETO CONTA
		Conta conta = new Conta();
		conta.nomeTitular = "Jeferson Ferreira";
		conta.agencia = "1309";
		conta.numero = 100075;
		conta.saldo = 0.0;
		
		//INSTÂNCIANDO OBJETO DATA
		Data data = new Data();
		conta.dataAbertura = data;
		
		System.out.println("DADOS DA CONTA");
		System.out.println(conta.recuperaDadoParaImpressao());
		System.out.println("--------------------------");
		
		System.out.println("Realizando deposito");
		conta.depositar(1000.0);
		System.out.println("Depositado: " + conta.saldo);
		
		System.out.println("--------------------------");
		System.out.println("Sacando dinheiro");
		conta.sacar(50.0);
		System.out.println(conta.saldo);
		
		System.out.println("--------------------------");
		System.out.println( "Rendimento anual é de: " + conta.calculaRendimento());
		
	}

}
