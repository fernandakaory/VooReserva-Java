//testando
package Model;

import static View.Voo1_GUI.assento1_lbl;
import static View.Voo1_GUI.assento2_lbl;
import static View.Voo1_GUI.assento3_lbl;
import static View.Voo1_GUI.assento4_lbl;
import static View.Voo1_GUI.assento5_lbl;
import static View.Voo1_GUI.assento6_lbl;
import static View.Voo1_GUI.msg_lbl;

import static View.Voo2_GUI.assento01_lbl;
import static View.Voo2_GUI.assento02_lbl;
import static View.Voo2_GUI.assento03_lbl;
import static View.Voo2_GUI.assento04_lbl;
import static View.Voo2_GUI.assento05_lbl;
import static View.Voo2_GUI.assento06_lbl;
import static View.Voo2_GUI.msg2_lbl;

import java.awt.Color;
import javax.swing.JLabel;


public class Funcoes_DAO {

    public static boolean [] ocupados2 = {false, false, false, false, false, false};
    public static boolean [] ocupados1 = {false, false, false, false, false, false};
    public static int lotado1 = 0;
    public static int lotado2 = 0;
  
    public static void exibir1(){
        JLabel[] assentos1 = {assento1_lbl, assento2_lbl, assento3_lbl, assento4_lbl, assento5_lbl, assento6_lbl};
        
        lotado1 = 0;
        
        for(int cont = 0; cont < ocupados1.length ; cont++){
            if(ocupados1[cont]){
                assentos1[cont].setText(String.valueOf("X"));
                lotado1++;
            }else{
                assentos1[cont].setText(String.valueOf(" "));
            }
        }
        if(lotado1 == 6){
            msg_lbl.setText(String.valueOf("VÔO LOTADO"));
            msg_lbl.setForeground(Color.RED);
        }
    }
    public static void reservar1(){
        try {
            String x = View.Voo1_GUI.escolha_txt.getText();
            int assentoEscolhido = Integer.parseInt(x);
            
            if (lotado1 == 6){
                msg_lbl.setText(String.valueOf("VÔO LOTADO"));
                msg_lbl.setForeground(Color.RED);
            }else if(assentoEscolhido < 1 || assentoEscolhido > 6){
                msg_lbl.setText(String.valueOf("ASSENTO INEXISTENTE!"));
                msg_lbl.setForeground(Color.ORANGE);
            }else if(ocupados1[assentoEscolhido - 1]){
                msg_lbl.setText(String.valueOf("ASSENTO INDISPONÍVEL"));
                msg_lbl.setForeground(Color.ORANGE);
            }else{
                ocupados1[assentoEscolhido - 1] = true;
                exibir1();
                msg_lbl.setText(String.valueOf("RESERVA CONFRIMADA!"));
                msg_lbl.setForeground(Color.GREEN);
            }
            
        }catch(NumberFormatException e){
            msg_lbl.setText(String.valueOf("INFORME UM NÚMERO INTEIRO ENTRE 1-6"));
            msg_lbl.setForeground(Color.RED);
        }
        View.Voo1_GUI.escolha_txt.setText(String.valueOf(""));
    }
    
     public static void exibir2(){
        JLabel[] assentos2 = {assento01_lbl, assento02_lbl, assento03_lbl, assento04_lbl, assento05_lbl, assento06_lbl};
        
        lotado2 = 0;
        
        for(int cont = 0; cont < ocupados2.length ; cont++){
            if(ocupados2[cont]){
                assentos2[cont].setText(String.valueOf("X"));
                lotado2++;
            }else{
                assentos2[cont].setText(String.valueOf(" "));
            }
        }
        
        if(lotado2 == 6){
            msg2_lbl.setText(String.valueOf("VÔO LOTADO"));
            msg2_lbl.setForeground(Color.RED);
        }
    }
     
    public static void reservar2(){
        try {
            String x = View.Voo2_GUI.escolha2_txt.getText();
            int assentoEscolhido = Integer.parseInt(x);
            
            if (lotado2 == 6){
                msg2_lbl.setText(String.valueOf("VÔO LOTADO"));
                msg2_lbl.setForeground(Color.RED);
            }else if(assentoEscolhido < 1 || assentoEscolhido > 6){
                msg2_lbl.setText(String.valueOf("ASSENTO INEXISTENTE!"));
                msg2_lbl.setForeground(Color.ORANGE);
            }else if(ocupados2[assentoEscolhido - 1]){
                msg2_lbl.setText(String.valueOf("ASSENTO INDISPONÍVEL"));
                msg2_lbl.setForeground(Color.ORANGE);
            }else{
                ocupados2[assentoEscolhido - 1] = true;
                exibir2();
                msg2_lbl.setText(String.valueOf("RESERVA CONFRIMADA!"));
                msg2_lbl.setForeground(Color.GREEN);
            }
            
        }catch(NumberFormatException e){
            msg2_lbl.setText(String.valueOf("ESCOLHA UM NÚMERO INTEIRO ENTRE 1-6"));
            msg2_lbl.setForeground(Color.RED);
        }
        View.Voo2_GUI.escolha2_txt.setText(String.valueOf(""));
    }
}
