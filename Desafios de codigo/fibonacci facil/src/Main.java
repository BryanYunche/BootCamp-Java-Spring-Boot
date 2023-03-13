public class Main {
    public static void main(String[] args) {
        int N = 5;
        int proximo, anterior = 0, atual = 1;
        for (int i = 1; i <= N; i++) {
            //Isso aqui significa que quando estier no primeiro loop irá ser printado 0
            if (i == N) System.out.println(anterior);

            //TODO: Implemente a condição ideal para que possamos obter os valores solicitados:
            else System.out.print(anterior + " ");
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}