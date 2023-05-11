package main.java.com.example.ParqueaderoKevin.Modelo;
import jakarta.persistence.*;
@Entity
@Table(name = "Salida")
public class Salida {
    @Id
    @Column(name = "Placa")
    private String Placa;
    @Column (name = "Hora de entrada")
    private  String HoraDeEntrada;
    @Column (name = "Hora de salida")
    private  String HoraDeSalida;
    @Column (name = "Valor a pagar")
    private  String ValorAPagar;
    public Salida() {
    }
    public Salida(String Placa, String HoraDeEntrada, String HoraDeSalida, String ValorAPagar) {
        this.Placa = Placa;
        this.HoraDeEntrada = HoraDeEntrada;
        this.HoraDeSalida = HoraDeSalida;
        this.ValorAPagar = ValorAPagar;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getHoraDeEntrada() {
        return HoraDeEntrada;
    }

    public void setHoraDeEntrada(String horaDeEntrada) {
        HoraDeEntrada = horaDeEntrada;
    }

    public String getHoraDeSalida() {
        return HoraDeSalida;
    }

    public void setHoraDeSalida(String horaDeSalida) {
        HoraDeSalida = horaDeSalida;
    }

    public String getValorAPagar() {
        return ValorAPagar;
    }

    public void setValorAPagar(String valorAPagar) {
        ValorAPagar = valorAPagar;
    }
}