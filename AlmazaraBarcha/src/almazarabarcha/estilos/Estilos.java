package almazarabarcha.estilos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Estilos{

    public Estilos() {
    }
    
    
    
    public Font getFuenteEtiquetas(){
        CustomFont cf = new CustomFont();
        return cf.MyFont(0, (float)14);
    }
    
    public Font getFuenteTitulo(){
        CustomFont cf = new CustomFont();
        return cf.MyFont(0, (float)25);
    }
    
    public Font getFuenteBotones(){
        CustomFont cf = new CustomFont();
        return cf.MyFont(0, (float)16);
    }
    
    public Color getColorExterior(){
        //return new Color(236, 254, 44);
       // return new Color(255, 235, 59);
        return new Color(255, 255, 0);
    }
    
    public Color getColorInterior(){
        return new Color(255, 255, 255);
    }
    
    public Color getColorBotones(){
        return new Color(251, 192, 45);
    }
    
    public Image getImagenIcono(){
        URL url = getClass().getResource("icon_barcha.png");
        ImageIcon icon = new ImageIcon(url);
        return icon.getImage();
    }
    
}
