public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada() {
    }

    public ListaEncadeada(No<T> referenciaEntrada) {
        this.referenciaEntrada = null;
    }

    //Vai adicionar um nó no final da fila
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
    //Retorna o conteúdo do nó
    public T get(int index){
        return getNo(index).getConteudo();
    }

    //Método privado da Classe
    private No<T> getNo(int index){
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    //Método para remoção de nó
    public T remove(int index){
        //O nó pivor vai receber a referência do nó que vai ser removido
        No<T> noPivor = this.getNo(index);

        if (index == 0){
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        //Vai retornar o nó que foi removido
        return noPivor.getConteudo();
    }

    //Vai retornar o tamanho da lista
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

    //Vai validar se o indice é maior ou igual ao tamanho da lista
    private void validaIndice(int index){
        //Valida se o indice buscado é maior que a lista
        if (index >= size()){
            int ultimoIndice = size()-1;
            throw new IndexOutOfBoundsException("Não existe conteudo no indice " + index + " desta lista, esta lista só vai até " + ultimoIndice + '.' );
        }
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;

        for (int i = 0; i < this.size(); i++){
            strRetorno += "[No{conteudo: " + noAuxiliar +"}]-->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
