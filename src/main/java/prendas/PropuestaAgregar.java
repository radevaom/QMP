package prendas;

public class PropuestaAgregar extends   PropuestaModificacion {

  public PropuestaAgregar(Prenda prenda) {
    super(prenda);
  }

  @Override
  public void deshacer(Guardarropa guardaropas) {
    this.estado = Estado.DESECHA;
    guardaropas.quitarPrenda(this.prenda);
  }

  @Override
  public void ejecutarAceptacion(Guardarropa guardaropas) {
    guardaropas.agregarPrenda(this.prenda);
  }
}
