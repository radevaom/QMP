package prendas;

import aplicacion.Usuario;
import java.util.*;
import java.util.stream.Collectors;

public class Guardarropa {
  private List<Prenda> prendas = new ArrayList<>();
  //private Usuario propietario;
  //private List<Usuario> colaboradores;
  private List<PropuestaModificacion> propuestas;
  /*
  public Guardarropa(Usuario propietario) {
    this.propietario = propietario;
  }

    public Atuendo generarSugerencia(Integer temperatura) {
    Atuendo atuendo = new Atuendo();
    atuendo.agregarPrenda(filtrarPorTemperatura(superiores, temperatura)
        .get(new Random().nextInt()));
    atuendo.agregarPrenda(filtrarPorTemperatura(inferiores, temperatura)
        .get(new Random().nextInt()));
    atuendo.agregarPrenda(filtrarPorTemperatura(calzados, temperatura)
        .get(new Random().nextInt()));
    return atuendo;
  }

  public List<Prenda> filtrarPorTemperatura(List<Prenda> listaDePrendas, Integer temperatura) {
    return listaDePrendas.stream()
        .filter(prenda -> prenda.getTemperatura() <= temperatura).collect(Collectors.toList());
  }
*/
  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda) {
    prendas.remove(prenda);
  }

  public List<PropuestaModificacion> propuestasPendientes() {
    return this.propuestas.stream().filter(propuesta ->
        propuesta.getEstado() == Estado.PENDIENTE).collect(Collectors.toList());
  }

  public List<Atuendo> combinacionesPosibles() {
    // TODO: Algoritmo para obtener todas las combinaciones de atuendos posibles.
    //  Un atuendo tiene que estar compuesto de prendas de las 4 categorias.
    return null;
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }

  public void setPrendas(Prenda ... prendas) {
    Collections.addAll(this.prendas, prendas);
  }
  /*
  public Usuario getPropietario() {
    return propietario;
  }

  public List<Usuario> getColaboradores() {
    return colaboradores;
  }

  public void setColaboradores(Usuario ... usuario) {
    Collections.addAll(this.colaboradores, usuario);
  }
  */
}
