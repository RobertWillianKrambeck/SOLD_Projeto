package br.udesc.ceavi.progii.sold.imagens;

import javax.swing.ImageIcon;

/**
 *  Esta classe mantem as imagens do projeto
 * @author Gustavo Santos
 * @version 1.0
 * @since 18/04/2018
 */
public class Image {
    private final ImageIcon imageIcon;
    private final ImageIcon imageLogo;
    private final ImageIcon imageFundo;

    public Image() {
        this.imageIcon = new ImageIcon(getClass().getResource("icon_sold.jpg"));
        this.imageLogo = new ImageIcon(getClass().getResource("logo_sold.jpg"));
        this.imageFundo = new ImageIcon(getClass().getResource("fundo_sold.jpg"));
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public ImageIcon getImageLogo() {
        return imageLogo;
    }

    public ImageIcon getImageFundo() {
        return imageFundo;
    }
}
