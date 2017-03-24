/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack;

/**
 *
 * @author Ahsan's
 */
public class Main {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                javafx.application.Application.launch(Gridfx.class);
            }
        }.start();
    
    
    }
    
}