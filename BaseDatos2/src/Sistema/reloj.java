/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author Edu Lopez
 */
public class reloj extends Thread{
    private JLabel lbl;
    public reloj (JLabel lbl){
        this.lbl=lbl;
    }
 public void run(){
        while(true){
            Date hoy = new Date();
            SimpleDateFormat s=new SimpleDateFormat("hh:mm:ss");
            lbl.setText(s.format(hoy));
            try{sleep(1000);
                    }catch(Exception ex){
                        
                    }
        }
    }
}
