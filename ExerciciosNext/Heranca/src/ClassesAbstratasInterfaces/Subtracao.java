package ClassesAbstratasInterfaces;

public class Subtracao implements OperacaoMatematica {
    int subtracao;
    @Override
    public int calcula(int a, int b){
        subtracao = a - b;
        return subtracao;
    }
}
