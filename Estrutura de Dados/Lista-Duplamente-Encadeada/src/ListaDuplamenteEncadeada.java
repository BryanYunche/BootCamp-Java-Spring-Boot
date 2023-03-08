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

    //Sobrecarga do método add
    public void add(int index, T elemento){
        //Pega o nó que tá no indice que eu tô passando
        NoDuplo<T> noAuxiliar = getNo(index);
        //Cria um nó a partir do elemento inserido
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        //Isso quer dizer que o novo nó vai ser adcionado imediatamente atrás do indice do nó do parâmentro
        novoNo.setNoProximo(noAuxiliar);

        //Se esse indice que pegamos NÃO for o ultimo item da lista
        if (novoNo.getNoProximo() != null){
            //O nó previo do nó do indice que pegamos, agora é o nó prévio do indice que iremos colocar
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            //Agora o nó previo do nó que passamos no indice, será o novo nó que estamos incerindo
            novoNo.getNoProximo().setNoPrevio(novoNo);
        }else {
            //Se for nulo, estamos no ultimo elemento da nossa lista
            novoNo.setNoPrevio(ultimoNo);
            //Logo o novo nó vai ser o ultimo nó da lista
            ultimoNo = novoNo;
        }

        //Se for o primeiro indice da lista
        if (index == 0) {
            primeiroNo = novoNo;
        }else {
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        //Aumenta em um o tamanho da lista
        tamanhoLista++;
    }

    //Remove um nó da fila de acordo com o indice
    public void remove(int index){

        if (index == 0){
            primeiroNo = primeiroNo.getNoProximo();
            //Testa se o segundo nó da lista existe
            if (primeiroNo != null){
                primeiroNo.setNoPrevio(null);
            }else {
                //Se esse não for o primeiro nó da lista
                NoDuplo<T> noAuxiliar = getNo(index);
                noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
                //Testa se eu NÃO estou no ultimo nó
                if (noAuxiliar != ultimoNo){
                    noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
                }else {
                    //Se for o ultimo nó
                    ultimoNo = noAuxiliar;
                }
            }
        }
        tamanhoLista--;
    }

    //Método que retorna um nó a partir de um index
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

    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAuxiliar = primeiroNo;

        //Percorrer a lista
        for (int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo: "+ noAuxiliar.getConteudo() + "}] ->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
