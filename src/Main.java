//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ex.1
        String corSemaforo = "verde";

        if (corSemaforo == "verde" || corSemaforo == "Verde") {
            System.out.println("Siga");
        } else if (corSemaforo == "amarelo" || corSemaforo == "Amarelo") {
            System.out.println("Atenção");
        } else if (corSemaforo == "vermelho" || corSemaforo == "Vermelho") {
            System.out.println("Pare");
        } else {
            System.out.println("Cor inválida no sistema");
        }
        //Ex.2

        int idade = 10;

        if (idade > 0 && idade <= 12) {
            System.out.println("criança");
        } else if (idade > 12 && idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade > 17 && idade <= 64) {
            System.out.println("Adulto");
        } else if (idade < 65) {
            System.out.println("idoso");
        } else {
            System.out.println("Idade inválida");
        }
        //Ex.3 _ Operador Ternário

        int x = 50;
        boolean r;
        r = x > 30 ? true : false;
        System.out.println(r);

        //Ex. 5

        idade = 10;
        String maioridade;
        maioridade = idade > 18 ? "maior de idade" : "menor de idade";
        System.out.println(maioridade);

        //Ex. Classificação de um Produto
        System.out.println("Digite o código do produto escolhido");
        System.out.println("Código 1 - Eletrônicos");
        System.out.println("Código 2 - Alimentos");
        System.out.println("Código 3 - Vestuário");


        //Ex. 6

        float preco = 100f;
        float desconto;
        desconto = preco > 80 ? 0.25f : 0;
        System.out.println("Valor com desconto = " + (preco - preco * desconto));

        //Ex. 10 Conversão de Moedas

        System.out.println("Digite o valor em reais R$: ");
        int conversaoMoeda = 2;
        switch (conversaoMoeda) {
            case 1:
                System.out.println("O valor em dólar é de USD: ");
                break;
            case 2:
                System.out.println("O valor em Euro é de: ");
                break;
            case 3:
                System.out.println("O valor em Libra é de: ");
                break;

            default:
                System.out.println("Não temos essa opção de conversão de moeda");
                break;

            //Ex Desconto em Compra
            System.out.println("Digite o valor da compra:R$ ");
            double valorCompra;
            double desconto = 0;
            if (valorCompra > 100) {
                desconto = valorCompra * 0.1;
            }
            double valorFinal = valorCompra - desconto;
            System.out.println("O valor total a ser pago é: R$ " + valorFinal);

            //Ex. Verificação da Nota
            System.out.println("Digite a sua nota");
            float nota;
            if (nota >= 7) {
                System.out.println("O aluno está aprovado");
            } else if (nota >= 5) {
                System.out.println("O aluno está em recuperação");
            } else {
                System.out.println("O aluno está reprovado");
            }
            //Ex. 7 Escolha de Operação

            //Ex. 7 Escolha de Operação

            System.out.println("Digite dois números inteiros");
            int escolhaUsuario = 3;

            switch (escolhaUsuario) {
                case 1:
                    System.out.println("soma");
                    break;
                case 2:
                    System.out.println("subtração");
                    break;
                case 3:
                    System.out.println("multiplicação");
                    break;
                case 4:
                    System.out.println("divisão");

                default:
                    System.out.println("Essa escolha não é válida");
                    break;

//Ex. 8 avaliação de Desempenho
                System.out.println("Digite a sua nota");
                int avaliacaoDesempenho = 4;
                switch (avaliacaoDesempenho) {
                    case 1:
                        System.out.println("Você precisa melhorar")
                        break;
                    case 2:
                        System.out.println("Você está abaixo da média");
                        break;
                    case 3:
                        System.out.println("Você está na média");
                        break;
                    case 4:
                        System.out.println("Você está acima da média");
                        break;
                    case 5:
                        System.out.println("Seu desempenho está excelente");
                    default:
                        System.out.println("Opção inválida");
                        break;

                }
            }





