package Notebook;

public class Interface {
    static void main() {
        Notebook note = new Notebook();

        note.modelo = "Dell";
        note.cor = "Preto";
        note.carga = 0;
        note.ligar();
        note.abrir();

        note.status();


        note.digitar();


    }



}
