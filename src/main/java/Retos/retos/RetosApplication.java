//Estructura

//1. Modelo o Entidad
//2. Interface
//3. Repositorio
//4. Servicios
//5. Controlador o Web

//Tablas

//1. Orthesis
//2. Categoria
//3. Cliente
//4. Mensaje
//5. Reservaciones
//6. Score

package Retos.retos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"Modelo"})
public class RetosApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetosApplication.class, args);
	}

}
