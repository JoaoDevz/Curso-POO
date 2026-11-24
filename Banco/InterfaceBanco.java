package Banco;

public class InterfaceBanco {
    static void main() {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("João");
        p1.openAccount("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Maria");
        p2.openAccount("CP");

        p1.depositary(100);
        p2.depositary(500);
        p2.withdraw(1000);

        p1.withdraw(150);
        p1.closeAccount();


        p1.estadoAtual();
        p2.estadoAtual();
    }
}
