package DesafioClasseData;
/*1.Crie uma classe data com os atributos dia, mes e ano.
    Além disso, instancie numa classe DataTeste 2 objetos da classe Data.
  2.Crie um método que retorne a data completa.
  3.Crie um construtor padrão, com os valores default de 01/01/1970, e um construtor personalizado
  para inserção de valores via parâmetro.
*/
public class Data {
    int dia, mes, ano;

    Data(){
        dia = 1;
        mes = 1;
        ano = 1970;
    }
    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    String formatarData(){
       return String.format("%d/%d/%d", dia, mes, ano);
    }

    void imprimirData(){
        System.out.println(formatarData());
    }
}
