package prendas;

public enum TipoDePrenda {
  ZAPATO(Categoria.CALZADO),
  CAMISA(Categoria.SUPERIOR);
  private final Categoria categoria;

  TipoDePrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public  Categoria getCategoria() {
    return this.categoria;
  }
}
