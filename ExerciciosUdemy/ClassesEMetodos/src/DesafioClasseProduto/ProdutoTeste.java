package DesafioClasseProduto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Livro",65);

        var p2 = new Produto();
        p2.nome = "Caderno";
        p2.preco = 18.50;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double custo1 = p1.precoComDesconto();
        double custo2 = p2.precoComDesconto(0.1);
        double custoTotal = custo1 + custo2;

        System.out.printf("O custo total do carrinho é R$%.2f.", custoTotal);
    }
}
