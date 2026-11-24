package Banco;

import java.util.Objects;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //MÉTODOS ESPECIAIS
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }

    public void setNumConta(int n ){
        this.numConta = n;
    }

    public int getNumConta() {
        return numConta;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return tipo;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return dono;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setStatus(boolean status){
        this.status = status;
    }

    public boolean getStatus(){
        return status;
    }


    //MÉTODOS PERSONALIZADOS

    public void estadoAtual(){
        System.out.println("------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void openAccount(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(Objects.equals(t, "CC")){
            this.setSaldo(50);
        }else if (t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    public void closeAccount() {
        if(this.getSaldo() > 0){
            System.out.println("Conta ainda não pode ser fechada");
        } else if( this.getSaldo() < 0){
            System.out.println("Não pode ser fechada pois ainda tem debito");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositary(float v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void withdraw(float v){
        if(this.getStatus()) {
            if(this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }


    public void payMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        }else if (this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else{
            System.out.println("Impossivel pagar uma conta fechada.");
        }
    }
}
