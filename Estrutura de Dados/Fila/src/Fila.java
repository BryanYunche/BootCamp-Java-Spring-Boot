public class Fila<T> {

    //estamos entrando na fila pelo final dela!
    private No<T> refNoEntradaFila;

    //Garante que quando a fila for instanciada ela tenha valor null
    public Fila(){
        this.refNoEntradaFila = null;
    }

    //Método para enfileirar um nó
    public void enqueue(T object){
        No novoNo = new No(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    //Método first, retorna o primeiro da fila
    public T first(){
        //Verifica se a lista está vazia
        if(!this.isEmpty()){
            //Caso tenha só um nó na fila só isso já resolve o problema
            No primeiroNo = refNoEntradaFila;
            //Vai varrer a fila até chegar no primeiro nó da fila
            while (true){
                //Testa se é o não é o primeiro nó
                //O primeiro nó de uma filá sempre vai ter uma referência que aponta pra null
                if (primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    //Se for o primeiro nó ele para o loop
                    break;
                }
            }
            //Retorna o primeiro nó quando a fila não está vazia
            //Fizemos um casting pra um tipo genérico
            return (T) primeiroNo.getObject();
        }
        //Retorna null se ela estuver vazia
        return null;
    }

    public T dequeue(){
        //Verifica se a lista está vazia
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            //Vai varrer a fila até chegar no primeiro nó da fila
            while (true){
                //Testa se é o não é o primeiro nó
                //O primeiro nó de uma filá sempre vai ter uma referência que aponta pra null
                if (primeiroNo.getRefNo() != null){
                    //Considerando que tem mais de um nó na fila
                    //O nó auxiliar pega a referência do nó imediatamente antes do primeiro nó da fila
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    //Aqui eu aponto a referência desse nó auxiliar para null
                    //Assim ele se tornará o primeiro da fila
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            //Retorna o primeiro nó quando a fila não está vazia
            //Casting para ser um topo genérico também
            return (T) primeiroNo.getObject();
        }
        //Retorna null se ela estuver vazia
        return null;
    }

    //Verifica se a fila está vazia
    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null){
            while (true){
                stringRetorno += "[No{objeto: "+ noAuxiliar.getObject() +"}] -->";
                //Verifica se tem mais de um elemento na fila
                if (noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else {
                    //Se tiver chegado a posição do primeiro nó na fila o loop vai parar
                    stringRetorno += "null";
                    break;
                }
            }

        }else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
