public class ReprodutorMusical {
    
  public String listaDeReproducao = "Playlist mais tocadas";
  public String musicaAtual = "Macarena";

  public void tocar() {
    System.out.println("Tocando " + listaDeReproducao + ".");
  }

  public void pausar() {
    System.out.println("Pausando " + musicaAtual + ".");
  }

  public void selecionarMusica() {
    System.out.println("Selecionando música da " + listaDeReproducao + ".");
  }
}