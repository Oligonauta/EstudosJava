package ClassesAbstratasInterfaces;

public class Retangulo implements Quadrilatero{
    public float lado;
    public float altura;
    public Retangulo(float lado, float altura){
        super();
        this.altura = altura;
        this.lado = lado;
    }
    @Override
    public float calcularArea(){
        return this.lado * this.altura;
    }
    @Override
    public float calcularPerimetro(){
        return this.lado + this.altura;
    }
    @Override
    public void imprimirArea() {
        System.out.println("A área é = " + this.calcularArea());
    }
    @Override
    public void imprimirPerimetro() {
        System.out.println("O perimetro é = " + this.calcularPerimetro());
    }
}
