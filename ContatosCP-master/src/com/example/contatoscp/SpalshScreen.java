package br.edu.ifpb;
import javax.swing.*;

import java.awt.*;
import java.io.EOFException;
public class SplashScreen extends JWindow{

    private int duration;
    public SplashScreen(int d){
        duration = d;
    }

    public void showSplash(){
        JPanel content = (JPanel)getContentPane();
        content.setBackground(Color.yellow);

        int width = 450;
        int height = 115;

        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width-width)/2;
        int y = (screen.height-height)/2;

        setBounds(x,y,width,height);

//		construindo o splash

        JLabel label = new JLabel(new Imagelcon("android-icon.gif"));
        JLabel copyrt = new JLabel
                ("android-icon.gif",JLabel.CENTER);

        copyrt.setFont(new Font("Sans-Serif",Font.BOLD,10));
        content.add(label,BorderLayout.CENTER);
        content.add(copyrt,BorderLayout.SOUTH);
        Color oraRed = new Color(156,20,20,255);
        content.setBorder(BorderFactory.createLineBorder(oraRed, 10));

//	mostrar

        setVisible(true);

        try{Thread.sleep(duration);}catch(EOFException e){}

        setVisible(false);


    }

    public void showSplashAndExit(){
        showSplash();
        System.exit(0);



    }

    public static void main(String[]args){
        SplashScreen splash = new SplashScreen(10000);
        splash.showSplashAndExit();
    }
}
