public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    //Adiciona um nó no final da lista
    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);

        if (primeiroNo == null){
            primeiroNo = novoNo;
        }
        if (ultimoNo != null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private NoDuplo<T>  getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;
        //O (teste i < index) garante que o laço percorra a lista até o index nó pedido no parâmentro do método
        //O teste (noAuxiliar != null) garante que caso chegue ao final da lista quebre o laço
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            //Estrutura que corre a lista
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public int size(){
        return tamanhoLista;
    }
}
