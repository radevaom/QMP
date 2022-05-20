package aplicacion;

import java.util.List;
import java.util.Map;

public interface TiempoApi {
   List<Map<String, Object>> getWeather(String ciudad);
}
