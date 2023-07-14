import javax.swing.*;
import java.io.*;

public class ventana {
    private JButton CARGARDATOSDESDEELButton;
    private JButton GUARDARDATOSENDISCOButton;
    private JButton button3;
    private JButton button4;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JComboBox comboBox1;

    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JCheckBox VERDECheckBox;
    private JCheckBox NINGUNOCheckBox;
    private JCheckBox ROJOCheckBox;
    private JPanel VENTANA;
    private JRadioButton SIRadioButton;
    private JRadioButton NORadioButton;
///vvvariables para guardar datos
    int codigo;
    int cedula;
    String nombre;
    String apellido;
    String signo;
    int anio;
    String mes;
    int dia;
    boolean casdo=false;
    int color;



    public static void main(String[] args) {
        JFrame frame = new JFrame("ventana");
        frame.setContentPane(new ventana().VENTANA);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
// Para leer y escribir el archivo
        String filePath = "datos.dat";
        MiClase miObjeto = new MiClase();
        try(FileOutputStream fileOut=new FileOutputStream(filePath);
            ObjectOutputStream obOut= new ObjectOutputStream(fileOut)
        ){
            obOut.writeObject(miObjeto);
            System.out.println("archivo escrito correctamente");
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        ////

        try(
                FileInputStream fileIn = new FileInputStream(filePath);
                ObjectInputStream objIn= new ObjectInputStream(fileIn);
        ){
            MiClase readObject= (MiClase) objIn.readObject();
            System.out.println("El objeto en disco es "+readObject);
        }catch (IOException e){
            throw new RuntimeException(e);
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }


}
