package prendas;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class Guardarropa {
  List<Prenda> superiores;
  List<Prenda> inferiores;
  List<Prenda> calzados;

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
        .filter(prenda -> prenda.getTemperatura()<=temperatura).collect(Collectors.toList());
  }
}
