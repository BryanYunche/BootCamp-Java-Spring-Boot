public class Main {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> listaDupla = new ListaDuplamenteEncadeada<>();

        listaDupla.add("C1");
        listaDupla.add("C2");
        listaDupla.add("C3");
        listaDupla.add("C4");
        listaDupla.add("C5");
        listaDupla.add("C6");
        listaDupla.add("C7");


        System.out.println(listaDupla);

        listaDupla.remove(3);
        listaDupla.add(3, "99");
        System.out.println(listaDupla);

        System.out.println(listaDupla.get(3));

        System.out.println(listaDupla.size());


    }
}