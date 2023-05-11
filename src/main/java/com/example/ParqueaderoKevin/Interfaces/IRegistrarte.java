package main.java.com.example.ParqueaderoKevin.Interfaces;

import main.java.com.example.ParqueaderoKevin.Modelo.Registrate;
import org.springframework.data.repository.CrudRepository;

public interface IRegistrarte  extends CrudRepository<Registrate, Integer> {
}