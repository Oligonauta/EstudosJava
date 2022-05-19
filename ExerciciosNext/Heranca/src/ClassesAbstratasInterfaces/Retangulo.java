package ClassesAbstratasInterfaces;

public class Retangulo extends Quadrilatero{
    public float lado;
    public float altura;

    public Retangulo(float lado, float altura){
        super();
        this.altura = altura;
        this.lado = lado;
    }
    @Override
    float calcularArea(){
        return this.lado * this.altura;
    }
    @Override
    float calcularPerimetro(){
        return this.lado + this.altura;
    }
}
