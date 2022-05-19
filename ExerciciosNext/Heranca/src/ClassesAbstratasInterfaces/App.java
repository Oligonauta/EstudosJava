package ClassesAbstratasInterfaces;

public class App {
    public static void main(String[] args) {
        Quadrilatero r1 = new Retangulo(10f,15f);
        r1.calcularPerimetro();
        r1.calcularArea();
    }
}
