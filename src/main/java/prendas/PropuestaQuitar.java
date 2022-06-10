package prendas;

public class PropuestaQuitar extends   PropuestaModificacion {
  public PropuestaQuitar(Prenda prenda) {
    super(prenda);
  }

  @Override
  public void deshacer(Guardarropa guardaropas) {
    this.estado = Estado.DESECHA;
    guardaropas.agregarPrenda(this.prenda);
  }

  @Override
  public void ejecutarAceptacion(Guardarropa guardaropas) {
    guardaropas.quitarPrenda(this.prenda);
  }
}
