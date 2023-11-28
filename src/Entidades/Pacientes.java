package Entidades;
import java.io.Serializable;
import java.util.Date;

public class Pacientes implements Serializable {

    String matricula;
    String nombre;
    String apMaterno;
    String apPaterno;
    String genero;
    Date fechaNacimiento;
    Date fechaConsulta;

    public Pacientes() {}

    //Matricula
    public String getMatricula() { return this.matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //Nombre
    public String getNombre() { return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //ApPaterno
    public String getApPaterno() { return this.apPaterno;
    }
    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    //ApMaterno
    public String getApMaterno() { return this.apMaterno;
    }
    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    //Genero
    public String getGenero() { return this.genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    //Fecha de nacimiento
    public Date getFechaNacimiento() { return this.fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    //Fecha de consulta
    public Date getFechaConsulta() { return this.fechaConsulta;
    }
    public void setFechaConsulta(Date fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }


}
