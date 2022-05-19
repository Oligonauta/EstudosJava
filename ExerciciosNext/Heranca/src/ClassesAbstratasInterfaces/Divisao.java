package ClassesAbstratasInterfaces;

public class Divisao implements OperacaoMatematica {
    int divisao;
    @Override
    public int calcula(int a, int b){
        divisao = a / b;
        return divisao;
    }
}
