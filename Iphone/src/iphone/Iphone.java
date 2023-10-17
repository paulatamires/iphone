package iphone;

import iphone.navegador.NavegadorDeInternet;
import iphone.reprodutor.ReprodutorMusical;
import iphone.fone.AparelhoFone;

public class Iphone implements AparelhoFone, ReprodutorMusical, NavegadorDeInternet {
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
    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecioando musica");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }
}