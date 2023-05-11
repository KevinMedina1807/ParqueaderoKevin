package main.java.com.example.ParqueaderoKevin.Modelo;
import jakarta.persistence.*;
@Entity
@Table(name = "Registrate")
public class Registrate {
        @Id
        @Column(name = "Nombre")
        private String Nombre;
        @Column (name = "Cedula")
        private  String Cedula;
        @Column (name = "Placa")
        private  String Placa;
        public Registrate() {
        }
        public Registrate(String Nombre, String Cedula, String Placa) {
            this.Nombre = Nombre;
            this.Cedula = Cedula;
            this.Placa = Placa;
        }

        public String getNombre() {
                return Nombre;
        }

        public void setNombre(String nombre) {
                Nombre = nombre;
        }

        public String getCedula() {
                return Cedula;
        }

        public void setCedula(String cedula) {
                Cedula = cedula;
        }

        public String getPlaca() {
                return Placa;
        }

        public void setPlaca(String placa) {
                Placa = placa;
        }
}