package vvproject;

import javax.swing.JFrame;

/**
 * Developer: VINCENT VILLAFUERTE
 */
public class VVProject {

    public static void main(String[] args) {
        //PINDUTIN ANG F6 SA KEYBOARD PARA MAG DABEST -V
        LoadingScreen run = new LoadingScreen();
        run.setVisible(true);
        run.setExtendedState(run.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        try {
            for (int v=0; v<=100; v++){
                Thread.sleep(247);
                LoadingScreen.loadingbar.setValue(v);
                if (v==100) {
            SharkHome myFrame = new SharkHome();
            myFrame.setVisible(true);
            myFrame.setExtendedState(myFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
            run.setVisible(false);
            }
            }
        }catch (Exception e) {
            e.printStackTrace();
    }
    }
    
}
