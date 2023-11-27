import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cancion laCancion = new Cancion("The Scientist","A Rush of Blood to the Head","ColdPlay",8000);
        ManejarTendencias laTendencia = new ManejarTendencias();

        if(laCancion.getMeGusta()>20000){
            laTendencia.yaEstaFlama(laCancion);
        } else if(laCancion.getMeGusta()>10000){
            laTendencia.estaEnAuge(laCancion);
        } else if(laCancion.getMeGusta()>5000){
            laTendencia.esNormal(laCancion);
        } else {
            System.out.println("Está canción no se encuentra en las tendencias");
        }

//        int code = 0x2202;
//        char ch_code = (char) code;
//        String code_str = String.valueOf(ch_code);
//        //JOptionPane.showMessageDialog(null,code_str);
//        System.out.println(code_str + " \uD83D\uDE80" );
    }
}