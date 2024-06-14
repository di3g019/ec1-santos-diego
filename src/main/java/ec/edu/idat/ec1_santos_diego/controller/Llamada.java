package ec.edu.idat.ec1_santos_diego.controller;

import ec.edu.idat.ec1_santos_diego.Telefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Llamada {

    @Autowired
    private Telefono llamadaService;

    @GetMapping("/calcularCostoLlamada")
    public String calcularCostoLlamada(@RequestParam int minutos) {
        double costoTotal = llamadaService.calcularCostoLlamada(minutos);
        return "El costo total de la llamada es: $" + costoTotal;
    }
}
