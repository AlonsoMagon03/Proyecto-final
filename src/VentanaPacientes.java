import DAO.PacientesCRUD;
import Entidades.Pacientes;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;


public class VentanaPacientes extends JFrame {
    private JPanel miPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textNombreP;
    private JTextField ApPaterno;
    private JTextField ApMaterno;
    private JComboBox cbSexo;
    private JComboBox cbDia;
    private JComboBox cbMes;
    private JComboBox cbAño;
    private JComboBox cbHora;
    private JComboBox cbMinutos;
    private JTextField textMatricula;
    private JButton buscarButton;
    private JButton eliminarButton;
    private JButton guardarButton1;
    private JButton btnLimpiar;

//Bóton de BUSCAR
    public VentanaPacientes() {
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PacientesCRUD crud = new PacientesCRUD();
                crud.buscarPacientePorMat(textMatricula.getText());
                String matricula = textMatricula.getText();
                Pacientes a = crud.buscarPacientePorMat(matricula);

                if(a==null){
                    JOptionPane.showMessageDialog(miPanel,"No se encontró el paciente con la matrícula "+matricula);
                }else{
                    textNombreP.setText(a.getNombre());
                    ApPaterno.setText(a.getApPaterno());
                    ApMaterno.setText(a.getApMaterno());
                }

            }
        });

//Botón de LIMPIAR
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//Texto
                textMatricula.setText("");
                textNombreP.setText("");
                ApPaterno.setText("");
                ApMaterno.setText("");
//Opción
                cbSexo.setSelectedIndex(0);
                cbDia.setSelectedIndex(0);
                cbMes.setSelectedIndex(0);
                cbAño.setSelectedIndex(0);
                cbHora.setSelectedIndex(0);
                cbMinutos.setSelectedIndex(0);

            }
        });
/* PROFE, AQUÍ TENGO DUDA DE COMO HACER PARA VALIDAR CAMPOS CORRECTAMENTE

        //Botón de GUARDAR (CAMPOS VACIOS)
        guardarButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textNombreP.getText().isEmpty() || ApPaterno.getText().isEmpty() || ApMaterno.getText().isEmpty() || textMatricula.getText().isEmpty()) {
                }
                JOptionPane.showMessageDialog(null,"Favor de NO dejar campos vacíos");

            }
        });

 */

    }

    public static void main(String[] args) {
        VentanaPacientes v = new VentanaPacientes();
        v.setContentPane(v.miPanel);
        v.setSize(500,500);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setVisible(true);
    }
}
