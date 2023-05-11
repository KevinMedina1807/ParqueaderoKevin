package main.java.com.example.ParqueaderoKevin.Modelo;
import jakarta.persistence.*;
@Entity
@Table(name = "Entrada")
public class Entrada {
    @Id
    @Column(name = "Placa")
    private String Placa;
    @Column (name = "Tipo")
    private  String Tipo;
    @Column (name = "Hora de entrada")
    private  String HoraDeEntrada;
    @Column (name = "Fecha de entrada")
    private  String FechaDeEntrada;
    public Entrada() {
    }
    public Entrada(String Placa, String Tipo, String HoraDeEntrada, String FechaDeEntrada) {
        this.Placa = Placa;
        this.Tipo = Tipo;
        this.HoraDeEntrada = HoraDeEntrada;
        this.FechaDeEntrada = FechaDeEntrada;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getHoraDeEntrada() {
        return HoraDeEntrada;
    }

    public void setHoraDeEntrada(String horaDeEntrada) {
        HoraDeEntrada = horaDeEntrada;
    }

    public String getFechaDeEntrada() {
        return FechaDeEntrada;
    }

    public void setFechaDeEntrada(String fechaDeEntrada) {
        FechaDeEntrada = fechaDeEntrada;
    }
}