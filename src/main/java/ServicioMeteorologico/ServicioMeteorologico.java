package ServicioMeteorologico;

import aplicacion.Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface ServicioMeteorologico {

  List<Map<String,Object>> ultimasAlertas = new ArrayList<>();

  List<Lista> observerAlertasMeteorologicas = new ArrayList<>();


  int obtenerTemperatura(String lugar);

  void obtenerAlertaMeteorologica(String lugar);
}
