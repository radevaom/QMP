package prendas;

import java.util.List;

public class Atuendo {
  List<Prenda> prendas;
  Boolean uniforme;

  @SuppressWarnings("checkstyle:MissingJavadocMethod")
  public void agregarPrenda(Prenda prenda) {
    if (prendas.stream().noneMatch(prenda1 -> prenda1.tipoDePrenda.getCategoria().equals(prenda.tipoDePrenda.getCategoria()))) {
      this.prendas.add(prenda);
    } else {
      throw new PrendaInvalidaException("no se puede repetir categoria");
    }
  }

  @SuppressWarnings("checkstyle:MissingJavadocMethod")
  public Boolean esUniforme() {
    return prendas.stream().noneMatch(prenda1 -> prenda1.tipoDePrenda.getCategoria().equals(Categoria.ACCESORIOS))
        || prendas.stream().anyMatch(prenda -> prenda.tipoDePrenda.getCategoria().equals(Categoria.CALZADO))
        || prendas.stream().anyMatch(prenda -> prenda.tipoDePrenda.getCategoria().equals(Categoria.SUPERIOR))
        || prendas.stream().anyMatch(prenda -> prenda.tipoDePrenda.getCategoria().equals(Categoria.INFERIOR));
  }

  public Boolean corroborarTemperaturas(Integer temp) {
    return prendas.stream().allMatch(prenda -> prenda.temperatura<temp);
  }
}
