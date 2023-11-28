package Entidades;

import Entidades.Pacientes;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;


public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ArrayList<Pacientes> lista = new ArrayList<Pacientes>();
        Pacientes p = new Pacientes();
        p.setMatricula("0000");
        p.setNombre("Javier Alonso");
        p.setApPaterno("Paulin");
        p.setApMaterno("López");

        Date fechaN = new Date();
        p.setFechaNacimiento(fechaN);
        Date fechaC = new Date();
        p.setFechaNacimiento(fechaC);
        lista.add(p);

        try {
//Mandar a archivo
            FileOutputStream escribir = new FileOutputStream("/Users/javieralonsopaulinlopez/Desktop/ListaPacientes/listapacientes.txt");
            ObjectOutputStream miStream = new ObjectOutputStream(escribir);
            miStream.writeObject(lista);
            miStream.close();
//Leer desde archivo
            FileInputStream leer = new FileInputStream("/Users/javieralonsopaulinlopez/Desktop/ListaPacientes/listapacientes.txt");
            ObjectInputStream miStream2 = new ObjectInputStream(leer);
            Object o = miStream2.readObject();
            ArrayList<Pacientes> otraLista = (ArrayList)o;
            Pacientes ClasePacientes = (Pacientes) otraLista.get(0);
            System.out.println(ClasePacientes.getNombre());
            miStream2.close();

        } catch (FileNotFoundException e1) {
            System.out.println("Archivo no encontrado.");
            System.out.println(e1);
        } catch (IOException e2) {
            System.out.println("Error de entrada y salida");
            System.out.println(e2);
        }catch (ClassNotFoundException e3) {
            System.out.println("Error al leer lista de clase Alumnos");
            System.out.println(e3);
        }
    }
}