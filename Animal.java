public class Animal {
    private String nome;
    private float comprimento;
    private int numeroDePatas;
    private String cor;
    private String ambiente;
    private float velocidadeMedia;

    public Animal(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia){
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroDePatas = numeroDePatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    public void getNome(){
        System.out.println(String.format("O nome do teu animal é %s", this.nome));
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void getComprimento(){
        System.out.println(String.format("O comprimento do teu animal é %s", this.comprimento));
    }
    public void setComprimento(float comprimento){
        this.comprimento = comprimento;
    }

    public void getNumeroDePatas(){
        System.out.println(String.format("O número de patas do teu animal é %s", this.numeroDePatas));
    }
    public void setNumeroDePatas(int numeroDePatas){
        this.numeroDePatas = numeroDePatas;
    }

    public void getCor(){
        System.out.println(String.format("A cor do teu animal é %s", this.cor));
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public void getAmbiente(){
        System.out.println(String.format("O ambiente do teu animal é %s", this.ambiente));
    }
    public void setAmbiente(String ambiente){
        this.ambiente = ambiente;
    }

    public void getVelocidadeMedia(){
        System.out.println(String.format("A velocidade média do teu animal é %s", this.velocidadeMedia));
    }
    public void setVelocidadeMedia(float velocidadeMedia){
        this.velocidadeMedia = velocidadeMedia;
    }

    public void dados(){
        System.out.println(String.format("O teu animal se chama %s e tem o comprimento de %f m.", this.nome, this.comprimento));
        System.out.println(String.format("Ele curiosamente tem %d patas e a cor dele é %s.", this.numeroDePatas, this.cor));
        System.out.println(String.format("Não sei como, mas ele vive em um %s.", this.ambiente));
        System.out.println(String.format("E não sei mais ainda como ele conseguiu %f de velocidade média...", this.velocidadeMedia));
        System.out.println(String.format("Você deveria colocar %s na Wikipedia.", this.nome));
    }
}