public class Calculadora {

    public Calculadora() {
    }

    public int soma(int numUm, int numDois){
        return numUm + numDois;
    }

    public int subtracao(int numUm, int numDois){
        return numUm - numDois;
    }

    public int multiplicacao(int numUm, int numDois){
        return numUm * numDois;
    }

    public float divisao(int numUm, int numDois){
        float resultado = 0.0f;
        if (numDois == 0){
            System.out.println("Você está tentando dividir " + numUm + " por 0!");
        }else {
            resultado = (float) numUm/(float) numDois;
            return resultado;
        }

        return resultado;
    }



}
