package Interfaz;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class ImagenFondo extends JPanel
{
    //Atributo de imagen de fondo
    private Image imagen;
    private ImageIcon imagenIcono;

    public ImagenFondo(String ruta) {
        //Establecemos la ruta del recurso(Imagen) a utilizar
        imagenIcono = new ImageIcon(ruta);
    }
    
    //Metodo para pintar la imagen de fondo
    public void paint(Graphics g)
    {
        //Se relaciona con el ojeto de la clase Image
        imagen = imagenIcono.getImage();
        //Se redibuja en todo el espacio del JFrame
        g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
        //Se establece el fondo transparente
        setOpaque(false);
        //Llamar el metodo
        super.paint(g);
    }//PintarImagen
    
    
}