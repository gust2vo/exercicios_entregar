import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    public double numero1, numero2;
    private double soma, diminui, multiplica, dividi, potencializaSoma, potenciacaoDiminui;
    private List<Double> fatores1, fatores2;

    public Calculadora() {
        fatores1 = new ArrayList<>();
        fatores2 = new ArrayList<>();
        
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getSoma() {
        adicao();
        return soma;
    }

    public double getSubtracao() {
        subtracao();
        return diminui;
    }

    public double getMultipicacao() {
        multipicacao();
        return multiplica;
    }

    public double getDivisao() {
        divisao();
        return dividi;
    }

    public double getPotencializacaoSoma() {
        potenciacaoSoma();
        return potencializaSoma;
    }

    public double getPotencializacaoDiminui() {
        potenciacaoDiminui();
        return potenciacaoDiminui;
    }

    public List<Double> getFatoracaoNumero1() {
        fatorizarNumero1(numero1);
        return fatores1;
    }

    public List<Double> getFatoracaoNumero2() {
        fatorizarNumero2(numero2);
        return fatores2;
    }

    /*
     * private boolean validarNumeros(double numero1, double numero2) { // Validar recebe as condiçoes e retorna false para não e valido e true para é valido
     * if (numero1 < 0 || numero1 > 50 || (numero2 < 0 || numero2 > 50)) {
     * return false;
     * } else {
     * return true;
     * }
     * }
     */

    private boolean validarNumeros(double numero1, double numero2) { // Esse validar return direto a condição
        return (numero1 >= 0 && numero1 <= 50) && (numero2 >= 0 && numero2 <= 50);
    }

    public boolean saoNumerosValidos() {
        return validarNumeros(numero1, numero2);
    }

    /*public double adicao() {
        if (validarNumeros(numero1, numero2)) {
            soma = numero1 + numero2;
            return soma;
        } else {
            return 0;
        }

    }*/

    private double adicao(){
        soma = numero1 + numero2;
        return soma;
    }

    private double subtracao(){
        diminui = numero1 - numero2;
        return diminui;
    }

    private double multipicacao(){
        multiplica = numero1 * numero2;
        return multiplica;
    }

    private double divisao(){
        dividi = numero1 / numero2;
        return dividi;
    }

    private double potenciacaoSoma(){
        potencializaSoma = (numero1 * numero1) + (numero2 * numero2);
        return potencializaSoma;
    }

    private double potenciacaoDiminui(){
        potenciacaoDiminui = (numero1 * numero1) - (numero2 * numero2);
        return potenciacaoDiminui;
    }

    private void fatorizarNumero1(double numero1) {
        for (int divisor = 2; divisor <= numero1; divisor++) {
            while (numero1 % divisor == 0) {
                fatores1.add((double) divisor);
                numero1 /= divisor;
            }
        }
    }

    private void fatorizarNumero2(double numero2) {
        for (int divisor = 2; divisor <= numero1; divisor++) {
            while (numero2 % divisor == 0) {
                fatores2.add((double) divisor);
                numero2 /= divisor;
            }
        }
    }



   
 
}
