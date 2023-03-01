public class No {
    //O atributo do tipo String conterá o valor do Nó vigente.
    private String conteudo;
    //Esse atributo guarda a referência do próximo Nó.
    private No proximo;

    //Construtor da Classe
    public No(String conteudo){
        this.conteudo = conteudo;
        this.proximo = null;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximo() {
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