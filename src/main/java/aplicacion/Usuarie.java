package aplicacion;

import java.util.ArrayList;
import java.util.List;
import prendas.Guardarropa;
import prendas.Prenda;


public class Usuarie {

  List<Guardarropa> guardarropas = new ArrayList<>();
  List<Prenda> sugerenciaDiaria = new ArrayList<>();
  String direccionMail;


  public void agregarGuardaropas(Guardarropa nuevoGuardaropas) {
    this.guardarropas.add(nuevoGuardaropas);
  }

  public void sacarGuardaropas(Guardarropa guardaropas) {
    this.guardarropas.remove(guardaropas);
  }

  public List<Guardarropa> getGuardarropas() {
    return guardarropas;
  }

  public void setGuardarropas(List<Guardarropa> guardarropas) {
    this.guardarropas = guardarropas;
  }

  public List<Prenda> getSugerenciaDiaria() {
    return sugerenciaDiaria;
  }

  public void setSugerenciaDiaria(List<Prenda> sugerenciaDiaria) {
    this.sugerenciaDiaria = sugerenciaDiaria;
  }
}
