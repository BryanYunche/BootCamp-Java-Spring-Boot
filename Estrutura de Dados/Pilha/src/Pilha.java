public class Pilha {

    //Encadeameto de nó RefNo01 -> RefNo02 -> RefNo03 -> RefNo04 ->  null
    //Pilha null <- RefNo01 <- RefNo02 <- RefNo03 <- RefNo04 <-  (no topo da pilha tem a ref do ultimo nó adcionado na pilha)

    private No refNoEntradaPilha;

    //Construtor da pilha
    //Esse construto recebe null como entrada, pois apesar a pilha existir não quer dizer que possua nó
    //Por isso mesmo estanciada a pilha ela está como null pois não aloquei um nó nela
    public Pilha(){
        this.refNoEntradaPilha = null;
    }

    //Método Push
    public void push(No novoNo){
        //Eu vou precisar do valor de referência do topo da pilha, por isso eu guardei
        No refAuxiliar = this.refNoEntradaPilha;
        //Aqui eu coloco o novo nó no topo da piha
        this.refNoEntradaPilha = novoNo;
        //Tendo o novo nó no topo da pilha
        //Eu mudo a referência de nó desse nó no topo, para o nó de baixo, que seria o antigo topo que eu guardei a referência.
        this.refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    //Método Pop
    public No pop(){
        //Se essa pilha não estiver vazia, faça.
        if (!this.isEmpty()){
            No noPoped = this.refNoEntradaPilha;
            //a referência do ultimo nó, vai sempre apontar para o nó debaixo
            //Por isso que é trocado o valor de referência do topo da pilha
            this.refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            //Retorna o nó que excluimos
            return noPoped;
        }
        return null;
    }

    //Método Top
    public No top(){
        return this.refNoEntradaPilha;
    }

    //Método Empty
    //Verifica se a pilha está vazia ou não
    public boolean isEmpty(){
        return this.refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno;
        stringRetorno =
                        "-----------------\n" +
                        "|     Pilha     |\n" +
                        "-----------------\n";

        No noAuxiliar = refNoEntradaPilha;

        //Essa estrutura de loop vai construir o nosso toString
        //Usamos um loop infinito pois não sabemos o tamanho da pilha
        while (true){
            if (noAuxiliar != null){
            //Construção de String de retorno
            stringRetorno += "| [No{dado: " + noAuxiliar.getDado() +"}] |\n";
            //agora vamos pegar o nó que está abaixo
            noAuxiliar = noAuxiliar.getRefNo();
            //Quando o programa rodar novamente vai imprimir o dado que está abaixo
            //Sabemos que esse loop só vai até a base da pilha pois o nó na base da pilha tem uma referência null
            }else {
                break;
            }
        }
        //Aqui indica visualmente o final da pilha
        stringRetorno += "=================\n";

        //Retorna o toString já construido
        return stringRetorno;
    }


}
