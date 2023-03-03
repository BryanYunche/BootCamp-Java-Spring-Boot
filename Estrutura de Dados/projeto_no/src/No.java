public class No<T> {
    //O atributo do tipo String conterá o valor do Nó vigente.
    private T conteudo;
    //Esse atributo guarda a referência do próximo Nó.
    private No<T> proximo;

    //Construtor da Classe
    public No(T conteudo){
        this.conteudo = conteudo;
        this.proximo = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}