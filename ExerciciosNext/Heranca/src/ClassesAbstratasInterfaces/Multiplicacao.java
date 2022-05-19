package ClassesAbstratasInterfaces;

public class Multiplicacao implements OperacaoMatematica {
    int multiplicacao;
    @Override
    public int calcula(int a, int b){
        multiplicacao = a * b;
        return multiplicacao;
    }
}
