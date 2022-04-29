package prendas;

import java.util.Objects;

public class Prenda {
  TipoDePrenda tipoDePrenda;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;
  TipoTrama trama;

  @SuppressWarnings({"checkstyle:MissingJavadocMethod", "checkstyle:WhitespaceAround", "checkstyle:EmptyBlock"})
  public Prenda(TipoDePrenda tipoDePrenda, Material material, Color colorPrincipal, Color colorSecundario, TipoTrama trama) {

    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    if (colorSecundario != null) {
      this.colorSecundario = colorSecundario;
    }
    this.trama = trama;

  }

  public Categoria getCategoria() {
    return tipoDePrenda.getCategoria();
  }
  /*
  @SuppressWarnings("checkstyle:MissingJavadocMethod")
  public Boolean prendaValida(TipoDePrenda _tipo, Material _material) {
    return _tipo != TipoDePrenda.CAMISA || _material != Material.PLASTICO;
    //... Definir màs compatibilidadades de prendas a mano (no se me ocurrió otra cosa Dx)
  }*/
}
