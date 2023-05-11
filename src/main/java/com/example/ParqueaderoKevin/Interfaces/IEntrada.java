package main.java.com.example.ParqueaderoKevin.Interfaces;
import main.java.com.example.ParqueaderoKevin.Modelo.Entrada;
import org.springframework.data.repository.CrudRepository;
public interface IEntrada extends CrudRepository<Entrada, Integer> {
}
