package Notebook;

public class Notebook {
    String modelo;
    String cor;
    int carga;
    boolean aberto;
    boolean ligado;

    void status(){
        System.out.println("Modelo do notebook: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está aberto? " + this.aberto);
        System.out.println("Está ligado? " + this.ligado);


    }

    void digitar(){
        if (this.aberto == true && this.ligado == true){
            System.out.println("Estou digitando...");
        }else{
            System.out.println("Não posso digitar. ");
        }

    }

    void abrir(){
        this.aberto = true;
    }

    void fechar(){
        this.aberto = false;
    }

    void ligar(){
        if(this.carga > 0 ){
            this.ligado = true;
            System.out.println("Bem vindo! Ligando....");
        }else{
            System.out.println("Não posso ligar agora, estou com báteria fraca e preciso carregar.");
        }


    }

    void desligar(){
        this.ligado = false;
        System.out.println("Notebook desligado");
    }

}
