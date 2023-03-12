public class Main {
    public static void main(String[] args) {

        Calculadora contasTeste = new Calculadora();

        System.out.println("A soma: " + contasTeste.soma(1, 2));
        System.out.println("A subtracao: " + contasTeste.subtracao(23, 35));
        System.out.println("A multiplicacao: " + contasTeste.multiplicacao(76, 89));
        System.out.println("A divisao: " + contasTeste.divisao(33, 3));
        System.out.println(contasTeste.divisao(20, 0));

        CumprimentoDoDia cumprimentoDoDia = new CumprimentoDoDia();
        cumprimentoDoDia.cumprimento();
    }
}