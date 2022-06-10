package aplicacion;

import java.util.ArrayList;
import java.util.List;
import prendas.Guardarropa;




public class Usuario {

  List<Guardarropa> guardarropas = new ArrayList<>();



  public void agregarGuardaropas(Guardarropa nuevoGuardaropas) {
    this.guardarropas.add(nuevoGuardaropas);
  }

  public void sacarGuardaropas(Guardarropa guardaropas) {
    this.guardarropas.remove(guardaropas);
  }




}
