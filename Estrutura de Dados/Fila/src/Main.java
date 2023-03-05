public class Main {

    public static void main(String[] args) {

        //Estanciei o meu objeto do tipo fila
        //Restinge o tipo de objetos que podem ser passados para a fila
        Fila<String> minhaFila = new Fila<>();

        //Adicionei um objeto na minha fila
        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("terceiro");
        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue("Ultimo");
        System.out.println(minhaFila);

        System.out.println(minhaFila.first());
        System.out.println(minhaFila);


    }
}
