package main.java.com.example.ParqueaderoKevin.InterfazService;

import main.java.com.example.ParqueaderoKevin.Modelo.Usuario;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"java.com.example.ParqueaderoKevin"})
public interface IInterfazService {

    public List<Usuario>listar();
    public Optional<Usuario>listarId(int id);
    public int save (Usuario p);
    public void delete(int id);

}
