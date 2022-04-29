package prendas;

import java.util.Objects;

public class BorradorPrenda {
  TipoDePrenda tipoPrenda;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;
  TipoTrama trama = TipoTrama.LISA;

  public BorradorPrenda(TipoDePrenda tipoPrenda) {
    this.tipoPrenda = tipoPrenda;
  }

  public void especificarColorPrincipal(Color color) {
    this.colorPrincipal = color;
  }

  public void especificarColorSecundario(Color color) {
    this.colorSecundario = color;
  }

  public void especificarMaterial(Material material) {
    this.material = material;
  }

  public void especificarTrama(TipoTrama trama) {
    this.trama = trama;
  }

  @SuppressWarnings("checkstyle:MissingJavadocMethod")
  public Prenda crearPrenda() {

    if (tipoPrenda == null || material == null || colorPrincipal == null) {
      throw new PrendaInvalidaException("se deben completar los campos de prenda material y color principal");
    }

    return new Prenda(tipoPrenda, material, colorPrincipal, colorSecundario, trama);
  }
}

