package aplicacion;

import APIs.MailSender;
import java.util.ArrayList;
import java.util.List;
import prendas.Prenda;



public class Lista {
  private final List<Usuarie> usuarios = new ArrayList<>();


  public void suscribir(Usuarie usuario) {
    this.usuarios.add(usuario);
  }

  public void notificarSugerenciaDiaria(List<Prenda> prendas) {
    this.usuarios.forEach(usuarie -> usuarie.setSugerenciaDiaria(prendas));
  }

  public void notificarMail(String mensaje) {
    MailSender mailSender = new MailSender();
    this.usuarios.forEach(usuarie -> mailSender.send(usuarie.direccionMail,mensaje));
  }
}
