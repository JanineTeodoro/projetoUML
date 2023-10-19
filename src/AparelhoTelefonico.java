public class AparelhoTelefonico {
  public String numeroDeTelefone;

  public AparelhoTelefonico(String meuNumero) {
    numeroDeTelefone = meuNumero;
  }

  public void ligar(String destino) {
    System.out.println(numeroDeTelefone + " ligando para o número " + destino + ".");
  }

  public void atender() {
    System.out.println("Atendendo a ligação.");
  }

  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz...");
  }
}
