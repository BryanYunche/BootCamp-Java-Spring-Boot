public class Main {
    public static void main(String[] args) {

        double h = 0;
        double n = 4;
        for (int i = 1; i <= n; i++) {
            //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
            h = h + (1/i);
        }

        //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
        h = (int) Math.round(h);
        System.out.println(h);
    }
}