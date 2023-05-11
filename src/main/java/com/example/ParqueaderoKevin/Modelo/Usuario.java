package main.java.com.example.ParqueaderoKevin.Modelo;
import jakarta.persistence.*;
@Entity
@Table(name = "Usuario")
public class Usuario{
    @Id
    @Column(name = "Nombre de usuario")
    private String NombreDeUsuario;
    @Column (name = "Contraseña")
    private  String Contraseña;
    public Usuario() {
    }
    public Usuario(String NombreDeUsuario, String Contraseña) {
        this.NombreDeUsuario = NombreDeUsuario;
        this.Contraseña = Contraseña;

    }

    public String getNombreDeUsuario() {
        return NombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        NombreDeUsuario = nombreDeUsuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }
}
