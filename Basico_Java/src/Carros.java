public class Carros {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int velocidade;

    public Carros(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidade = 0;
    }

    public void acelerar(int quantidade) {
        this.velocidade += quantidade;
    }

    public void frear(int quantidade) {
        if (this.velocidade - quantidade < 0) {
            this.velocidade = 0;
        } else {
            this.velocidade -= quantidade;
        }
    }

    // getters e setters para os atributos

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
    }
}