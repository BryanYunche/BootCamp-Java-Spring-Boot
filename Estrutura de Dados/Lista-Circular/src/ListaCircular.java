public class ListaCircular<T> {

    private No<T> cabeça;
    private No<T> cauda;
    private int tamanhoLista;


    public ListaCircular() {
        this.cauda = null;
        this.cabeça = null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if (this.tamanhoLista == 0){
            this.cabeça = novoNo;
            this.cauda = this.cabeça;
            this.cabeça.setNoProximo(cauda);
        }else {
            novoNo.setNoProximo(this.cauda);
            this.cabeça.setNoProximo(novoNo);
            this.cauda = novoNo;
        }

        this.tamanhoLista++;
    }

    public void remove(int index){
        if(index >= this.tamanhoLista){
            throw new IndexOutOfBoundsException("O indice é maior que o tamanho da lista");
        }

        No<T> noAuxiliar = this.cauda;

        //Testar se o nó que eu quero remover é a própria cauda
        if (index == 0){
            this.cauda = this.cauda.getNoProximo();
            this.cabeça.setNoProximo(this.cauda);
        }else if( index == 1){
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        }else {
            //Se o nosso nó que queremos remover não for nenhum dos indices acima, nós vamos procurar ele
            for (int i = 0; i < index - 1; i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }

        this.tamanhoLista--;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        if (this.isEmpty()){
            throw new IndexOutOfBoundsException("A lista está vazia!");
        }

        if (index == 0){
            return this.cauda;
        }

        No<T> noAuxiliar = cauda;
        //Apesar de ser um loop infinito, ele vai parar quado chegar no index escolhido
        for (int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;
    }





    public int size(){
        return this.tamanhoLista;
    }

    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

 }
