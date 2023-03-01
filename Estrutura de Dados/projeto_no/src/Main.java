public class Main {

    public static void main(String[] args) {
        //Nó inicial, ou primeiro Nó
        No no1 = new No("Conteúdo nó 01");

        //Segundo nó, tendo o próximo nó podemos mudar a referência
        //do deste nó no nó anterior, criando assim o elo entre eles.
        No no2 = new No("Conteúdo nó 02");
        no1.setProximo(no2);

        //No atributo que guarda a referência do próximo nó sempre é criada depois que ele estiver pronto
        No no3 = new No("Conteúdo nó 03");
        no2.setProximo(no3);

        //Novamente mudamos o valor do atributo que referência proxímo nó de null para nó criado
        //Sendo que o valor que referencia o próximo Nó permanesce Null até que o alteremos.
        No no4 = new No("Conteúdo nó 04");
        no3.setProximo(no4);

        //sendo assim, temos a seguinte congentura de Nó
        //no1->no2->no3->no4->null

        //Aqui mostra o valor do no1
        System.out.println(no1);
        //Aqui mostra a referência do próximo nó
        System.out.println(no1.getProximo());

        System.out.println("----------------------");

        //Aqui mostra o valor do no2
        System.out.println(no2);
        //Aqui mostra a referência do próximo nó
        System.out.println(no2.getProximo());

        System.out.println("----------------------");

        //podemos acessar os outros Nó apartir da valor de referência
        System.out.println(no2.getProximo().getProximo());
        System.out.println(no2.getProximo().getProximo().getProximo());





    }
}
