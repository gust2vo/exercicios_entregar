public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();
        calculadora.setNumero1(50);
        calculadora.setNumero2(10);
        
        /*
         * if(calculadora.soma == 0){
         * System.out.println("Voce digitou um numero menor do que zero ou maior 50");
         * }
         */

        if (!calculadora.saoNumerosValidos()) { // se o validar receber numeros invalidos imprimi essa mensagem
            System.out.println("Você digitou um número menor do que zero ou maior que 50.");
        } else {
            
            //System.out.println("A soma dos numeros é "+calculadora.adicao());// O metodo adição é privado
            //System.out.println(calculadora.getSoma());// variavel soma é privado por isso chama um getSoma

            System.out.println("A soma dos numeros é " + calculadora.getSoma() + "\nA subtração é " + calculadora.getSubtracao() + "\nA divisao é " + calculadora.getDivisao() + "\nA multiplicação é " + calculadora.getMultipicacao() + "\nA soma da potencia é " + calculadora.getPotencializacaoSoma() + "\nA subtração da potencia é " + calculadora.getPotencializacaoDiminui() + "\nA fatoralçao do numero 1 é " + calculadora.getFatoracaoNumero1() + "\nA fatoração do numero 2 é " + calculadora.getFatoracaoNumero2());
            
        }
    }
        
}
