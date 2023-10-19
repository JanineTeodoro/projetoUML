public class Iphone {
    public static void main(String[] args) throws Exception {
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

        reprodutorMusical.tocar();

        reprodutorMusical.selecionarMusica();

        reprodutorMusical.pausar();


        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico("(11)9888-8888");

        aparelhoTelefonico.ligar("(11)99999-9999");

        aparelhoTelefonico.atender();

        aparelhoTelefonico.iniciarCorreioVoz();


        NavegadorInternet navegadorInternet = new NavegadorInternet();

        navegadorInternet.exibirPagina();

        navegadorInternet.adicionarNovaAba();

        navegadorInternet.atualizarPagina();
    }
}
