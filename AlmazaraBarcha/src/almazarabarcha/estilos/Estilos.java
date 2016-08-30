package almazarabarcha.estilos;

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
    
    public Image getImagenIcono(){
        URL url = getClass().getResource("icon_barcha.png");
        ImageIcon icon = new ImageIcon(url);
        return icon.getImage();
    }
    
}
