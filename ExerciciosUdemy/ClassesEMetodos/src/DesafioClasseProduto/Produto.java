package DesafioClasseProduto;
/*Criar um valor de desconto constante na classe produto, transmitindo
este valor para todos os objetos da classe.*/
public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    Produto(){

    }

    Produto(String n, double p){
        nome = n;
        preco = p;
    }

    double precoComDesconto(){
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - (desconto + descontoDoGerente));
    }
}
