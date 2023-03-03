public class No {
    //Conteúdo do nó
    private int dado;
    //Endereço de refrência padrão do próximo nó
    private No refNo = null;

    //O costrutor está vazio pois a referências de nó sempre está vázia por padrão quando instanciada
    public No(No refNo) {}

    //Costrutor da classe nó
    public No(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}