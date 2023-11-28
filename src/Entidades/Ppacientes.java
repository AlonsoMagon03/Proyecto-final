package Entidades;

import DAO.PacientesCRUD;
import Entidades.Pacientes;

public class Ppacientes {

    public static void main(String[] args) {
        PacientesCRUD crud = new PacientesCRUD();
        Pacientes a = crud.buscarPacientePorMat("0000");
        if(a==null){
            System.out.println("No se encuentra alumno con esa matricula");
        }else{
            System.out.println(a.getNombre() + " " + a.getApMaterno());
        }

    }
}

