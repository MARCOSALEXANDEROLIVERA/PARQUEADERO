import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        String placa;
        String nombre;
        double entrada,salida;
        double resta,multi,veiculo;

        JOptionPane.showMessageDialog(null,"parqueadero siga llegando \n" +
                    "valor de hora o facturacion: carro 2000 moto 1000");
        placa = JOptionPane.showInputDialog("ingrese su placa");
        nombre = JOptionPane.showInputDialog("escriba su nombre");
        entrada = Double.parseDouble(JOptionPane.showInputDialog("escriba la hora de entrada"));

        JOptionPane.showMessageDialog(null,"parqueadero siga llegando \n" +
                "valor de hora o facturacion: carro 2000 moto 1000 \n \n" + "su placa es " + placa + "\n"+
                "su nombre es "+nombre + "\n"+
                "la hora de entrada es:"+entrada +"\n");
         salida = Double.parseDouble(JOptionPane.showInputDialog("escriba su hora de salida"));
       resta = salida-entrada;
       JOptionPane.showMessageDialog(null,"el tiempo que paso es de"+Math.ceil(resta));
       veiculo = Double.parseDouble(JOptionPane.showInputDialog("escriba 1 si es carro y 2 si es moto"));
    /* if(veiculo == 1) {
           multi =Math.ceil(resta)*2000;
           JOptionPane.showMessageDialog(null, "valor a pagar por su carro es " + multi);
       }
       else {
           multi =Math.ceil(resta)*1000;
           JOptionPane.showMessageDialog(null,"valor a pagar de su moto es"+multi);
       }
*/
        switch ((int)veiculo ){

            case 1: multi = Math.ceil(resta) * 2000;
                JOptionPane.showMessageDialog(null, "valor a pagar es " + multi);
                break;
            case 2: multi = Math.ceil(resta)*1000;
            JOptionPane.showMessageDialog(null,"valor pagar de carro es "+multi);
            break;
            default : JOptionPane.showMessageDialog(null,"el valor a pagar no es");
        }
    }
}