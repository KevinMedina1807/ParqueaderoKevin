package main.java.com.example.ParqueaderoKevin.Interfaces;

import main.java.com.example.ParqueaderoKevin.Modelo.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuario  extends CrudRepository<Usuario, Integer> {
}