import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploDeOrdenacao {
    public static void main(String[] args) {
        /*
        Dadas as seguintes sobre meus gatos, crie uma lista e ordene esta lista exibindo:
        Nome - Idade - Cor

        Gato 01 = nome: Jon, idade: 18, cor: preto
        Gato 02 = nome: Simba, idade: 6, cor: tigrado
        Gato 03 = nome: Jon, idade: 12, cor: amarelo
         */

        List<Gato> meusGatos = new ArrayList<Gato>(){{

            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrador"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println(meusGatos);

        System.out.println("{Ordem de inserção: }");
        System.out.println(meusGatos);

        System.out.println("{ordem Aleatória: }");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("{Ordem Natural (Nome)}");
        //Está sendo utilizado o sort do Collections pois ele utiliza o método implementado Compara To
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("{Ordem Idade}");
        Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("Ordem Cor");
        Collections.sort(meusGatos, new ComparatorCor());

        System.out.println("{ordenar por Nome/Cor/Idade}");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        System.out.println(meusGatos);


        
    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }


    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer .compare(g1.getIdade(), g2.getIdade());
    }
}
class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

