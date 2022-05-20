package aplicacion;

import APIs.AccuWeatherAPI;

import java.util.HashMap;

// primer req, le genero
public class Usuario {
  TiempoApi aplicacion;

  public Usuario(TiempoApi aplicacion) {
    this.aplicacion = aplicacion;
  }

  public int consultarClima(String ciudad) {
    return (int) aplicacion.getWeather(ciudad).get(0).get("Temperature");

  }

}
