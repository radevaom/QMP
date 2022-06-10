package prendas;

public abstract class PropuestaModificacion {

  protected Estado estado;
  protected Prenda prenda;

  public PropuestaModificacion(Prenda prenda) {
    this.estado = Estado.PENDIENTE;
    this.prenda = prenda;
  }

  public Estado getEstado() {
    return estado;
  }

  public void aceptar(Guardarropa guardaropas) {
    this.estado = Estado.ACEPTADA;
    this.ejecutarAceptacion(guardaropas);
  }

  public void rechazar() {
    this.estado = Estado.RECHAZADA;
  }

  public abstract void deshacer(Guardarropa guardaropas);

  public abstract void ejecutarAceptacion(Guardarropa guardaropas);
}
