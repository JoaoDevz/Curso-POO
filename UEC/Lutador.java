package UEC;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private  float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrotas;
    private int empates;

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public float getPeso(){
        return peso;
    }

    public void setPeso(float peso){
        this.peso = peso;
        this.setCategoria();
    }

    private void setCategoria(){
        if(this.peso <52.2) {
            categoria = "Inválido";
        }else if(this.peso <=70.3){
            categoria = "Leve";
        }else if(this.peso <= 83.9){
            categoria = "Médio";
        }else if(this.peso <= 120.2){
            categoria = "Pesado";
        }else{
            categoria = "Inválido";
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }


    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //Metodos

    public void apresentar(){
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + " m de altura");
        System.out.println("Pesando " + getPeso() + " KG");
        System.out.println("Ganhou: " + getVitoria());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());

    }

    public void Status(){
        System.out.println(getNome());
        System.out.println("é um peso " + getCategoria());
        System.out.println(getVitoria() + " vitorias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates");

    }

    public void ganharLuta(){
        setVitoria(getVitoria() + 1);

    }

    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);

    }

    public void empatarLuta(){
        setEmpates(getEmpates() + 1);

    }

    //Metodos especiais

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitoria = vi;
        this.derrotas = de;
        this.empates = em;
    }


}
