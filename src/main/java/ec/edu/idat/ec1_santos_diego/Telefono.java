package ec.edu.idat.ec1_santos_diego;

import org.springframework.stereotype.Service;
@Service
public class Telefono {


    public double calcularCostoLlamada(int minutos) {
        if (minutos <= 5) {
            return 10;
        } else {
            return 10 + 2 * (minutos - 5);
        }
    }
}
//http://localhost:8080/calcularCostoLlamada?minutos=X <- X debe ser modificada por el numero de minutos
