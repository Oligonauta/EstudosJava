package ClassesAbstratasInterfaces;

public class Soma implements OperacaoMatematica {
    int soma;
    @Override
    public int calcula(int a, int b){
        soma = a + b;
        return soma;
    }
}
