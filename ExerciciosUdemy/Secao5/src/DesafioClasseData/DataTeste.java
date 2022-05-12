package DesafioClasseData;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data(24,12,1999);
        Data d2 = new Data(26,12,1998);
        System.out.printf("%d/%d/%d\n", d1.dia,d1.mes,d1.ano);
        System.out.printf("%d/%d/%d\n", d2.dia,d2.mes,d2.ano);
    }
}
