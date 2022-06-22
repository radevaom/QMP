package prendas;

import APIs.NotificacionService;
import ServicioMeteorologico.ServicioMeteorologico;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AsesorDeImagen {
  private final ServicioMeteorologico servicioMeteorologico;
  private final NotificacionService notificacionService = new NotificacionService();

  public AsesorDeImagen(ServicioMeteorologico servicioMeteorologico) {
    this.servicioMeteorologico = servicioMeteorologico;
  }

  public Atuendo sugerirAtuendo(String lugar, Guardarropa guardaropas) {
    int temperatura = this.servicioMeteorologico.obtenerTemperatura(lugar);
    List<Atuendo> combinaciones = guardaropas.combinacionesPosibles();
    return combinaciones.stream().filter(atuendo -> atuendo.corroborarTemperaturas(temperatura)).collect(Collectors.toList()).get(0);
  }

  public List<Prenda> sugerenciaDiaria(Map<String, Object> alerta) {
    //TODO calcular las prendas segun lista de alertas
    if (alerta.get("CurrentAlerts").toString().contains("HAIL")) {
      notificacionService.notify("No usar el auto");
    }
    if (alerta.get("CurrentAlerts").toString().contains("STORM")) {
      notificacionService.notify("Llevar paraguas, tormenta al acecho");
    }

    return new ArrayList<>();
  }

}