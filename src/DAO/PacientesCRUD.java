package DAO;

import Entidades.Pacientes;

import java.io.*;
import java.util.ArrayList;

public class PacientesCRUD {
    public void insertarAlumno(Pacientes a){
        try{
            FileInputStream leer =
                    new FileInputStream("/Users/javieralonsopaulinlopez/Desktop/ListaPacientes/listapacientes.txt");
            ObjectInputStream miStream2 = new ObjectInputStream(leer);
            Object o = miStream2.readObject();
            ArrayList<Pacientes> otraLista = (ArrayList<Pacientes>)o;
            otraLista.add(a);

//Escribir al archivo
            FileOutputStream escribir =
                    new FileOutputStream("/Users/javieralonsopaulinlopez/Desktop/ListaPacientes/listapacientes.txt");
            ObjectOutputStream miStream = new ObjectOutputStream(escribir);
            miStream.writeObject(otraLista);
            miStream.close();
            miStream2.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public Pacientes buscarPacientePorMat(String matricula){

//Obtener lista de pacientes desde un archivo

        try{
            FileInputStream leer =
                    new FileInputStream("/Users/javieralonsopaulinlopez/Desktop/ListaPacientes/listapacientes.txt");
            ObjectInputStream miStream2 = new ObjectInputStream(leer);
            Object o = miStream2.readObject();
            ArrayList<Pacientes> otraLista = (ArrayList<Pacientes>)o;
            for(Pacientes a: otraLista){
                if(a.getMatricula().equals(matricula)){
                    return a;
                }
            }

            miStream2.close();
            return null;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}