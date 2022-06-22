package aplicacion;

import ServicioMeteorologico.ServicioMeteorologico;

public class Empleade {

  private ServicioMeteorologico servicioMeteorologico;

  public Empleade(ServicioMeteorologico servicioMeteorologico) {
    this.servicioMeteorologico = servicioMeteorologico;
  }

  public void actualizarAlertaMeteorologica(String lugar) {
    servicioMeteorologico.obtenerAlertaMeteorologica(lugar);
  }

}
