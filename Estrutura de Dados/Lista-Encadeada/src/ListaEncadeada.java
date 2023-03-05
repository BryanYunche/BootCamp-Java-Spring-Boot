public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada(No<T> referenciaEntrada) {
        this.referenciaEntrada = null;
    }

    public void add(T conteudo){
        //Instancia o conteudo do nó de acordo com o valor recebido
        No<T> novoNo = new No<>(conteudo);
        No<T> noAuxiliar = referenciaEntrada;

        //Se a lista estiver vazia, o novo nó que instanciamos será colocado como primeiro elemento da lista.
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
        }else {
            //Ele percorre até o final da lista
            for (int i = 0; i < this.size()-1; i++){
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            //Adiciona o nó no final da lista
            noAuxiliar.setProximoNo(novoNo);
        }
    }

    public int size(){
        int tamanhoLista = 0;

        No<T> referenciaAux = referenciaEntrada;
        while (true){
            if (referenciaAux != null){
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else{
                    //esse break é para quando a lista tiver um ou mais nó
                    break;
                }

            }else {
                //Esse break é para quando aminha lista estiver vazia
                break;
            }
        }

        return tamanhoLista;
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }
}
