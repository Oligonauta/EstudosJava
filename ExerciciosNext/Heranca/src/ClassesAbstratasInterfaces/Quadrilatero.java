package ClassesAbstratasInterfaces;
public abstract class Quadrilatero {
    abstract float calcularArea();
    abstract float calcularPerimetro();

    public void imprimirArea(){
        System.out.println("A área é = " + this.calcularArea());
    }
    public void imprimirPerimetro(){
        System.out.println("O perimetro é = " + this.calcularPerimetro());
    }
}

