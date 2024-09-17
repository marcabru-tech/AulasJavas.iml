public class Main {
	public static void main(String[] args){
		System.out.println("Digite o valor da sua venda: R$ ");
		double vendas = 1.500;
		double comissao;
		if (vendas < 1000){
			comissao = vendas*0.05;
		} else if (vendas <= 5000){
			comissao = vendas*0.1;
		} else comissao = vendas*0.15;
	} 
	System.out.println("A sua comissão é de: R$ ");
}
}
			