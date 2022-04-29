package prendas;

import java.util.List;

public class Atuendo {
  List<Prenda> prendas;
  Boolean uniforme;

  @SuppressWarnings("checkstyle:MissingJavadocMethod")
  public void agregarPrenda(Prenda prenda) {
    if (prendas.stream().noneMatch(prenda1 -> prenda1.tipoDePrenda.getCategoria() == prenda.tipoDePrenda.getCategoria())) {
      this.prendas.add(prenda);
    } else {
      throw new PrendaInvalidaException("no se puede repetir categoria");
    }
  }

  public void guardarBorradorUltimaPrenda() {
    Prenda ultimaPrenda = prendas.get(prendas.size()-1);
  }

  @SuppressWarnings("checkstyle:MissingJavadocMethod")
  public Boolean esUniforme() {
    return prendas.stream().noneMatch(prenda1 -> prenda1.tipoDePrenda.getCategoria() == Categoria.ACCESORIOS)
        || prendas.stream().anyMatch(prenda -> prenda.tipoDePrenda.getCategoria() == Categoria.CALZADO)
        || prendas.stream().anyMatch(prenda -> prenda.tipoDePrenda.getCategoria() == Categoria.SUPERIOR)
        || prendas.stream().anyMatch(prenda -> prenda.tipoDePrenda.getCategoria() == Categoria.INFERIOR);
  }
}
