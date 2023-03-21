import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
    //Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6] faça:

        //Essa forma de iniciar uma lista era feita antes do java 5
        //List notas = new ArrayList();

        //A partir do java 7 foi criado o conceito do Diamond Operator, o conceito de generics.
        //List<Double> notas = new ArrayList<>();

        //Iniciando o Arraylist com argumentos
        //List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6))
        //Declara da forma abaixo não permite a inserção nem remoção de outros argumentos na lista
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);*/


        System.out.println("Crie uma lista e adicione 7 notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: "+ notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0  na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 por nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem que foram informados: ");
        for (Double nota: notas) {
            System.out.println(nota);
        }
        System.out.println("Exiba a terceira nora adicionada: " + notas.get(2));
        System.out.println(notas);

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));


        Iterator<Double> iterador = notas.iterator();
        Double soma = 0d;
        //O iterator vai varrer toda a nossa lista
        while (iterador.hasNext()){
            Double next =iterador.next();
            soma += next;
        }
        System.out.println("Exiba a soma de todos os valores: " + soma);

        System.out.println("Exiba a média das notas: " + soma/ notas.size());

        System.out.println("Remoca a nota 0: ");
        //Quando for remover elementos da lista passe o indicador do tipo do elemento
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remosva as notas mneores que 7 e exiba a lista: ");
        Iterator<Double> iterator01 = notas.iterator();
        //Vai varrer toda a lista
        while (iterator01.hasNext()){
            Double next = iterator01.next();
            if (next < 7){
                iterator01.remove();
            }
        }

        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a a lista está vazia: " + notas.isEmpty());
        


    }
}