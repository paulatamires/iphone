package iphone.fone;

public class Fone implements AparelhoFone{

    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");

    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando Correio De Voz");

    }
}