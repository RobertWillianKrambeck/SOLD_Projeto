package br.udesc.ceavi.progii.sold.imagens;

import javax.swing.ImageIcon;

/**
 * Esta classe mantem as imagens do projeto
 *
 * @author Gustavo Santos
 * @version 1.0
 * @since 18/04/2018
 */
public class Image {

    private final ImageIcon imageIcon;
    private final ImageIcon imageLogo;
    private final ImageIcon imageFundo;
    private final ImageIcon imageDestaqueGeladeira;
    private final ImageIcon imageDestaqueImpresora;
    private final ImageIcon imageDestaqueSemFoto;
    private final ImageIcon imageDestaqueTelefone;

    public Image() {
        this.imageIcon = new ImageIcon(getClass().getResource("icon_sold.jpg"));
        this.imageLogo = new ImageIcon(getClass().getResource("logo_sold.jpg"));
        this.imageFundo = new ImageIcon(getClass().getResource("fundo_sold.jpg"));
        this.imageDestaqueGeladeira = new ImageIcon(getClass().getResource("geladeira_sold.jpg"));
        this.imageDestaqueImpresora = new ImageIcon(getClass().getResource("impresora_sold.jpg"));
        this.imageDestaqueSemFoto = new ImageIcon(getClass().getResource("semFoto_sold.jpg"));
        this.imageDestaqueTelefone = new ImageIcon(getClass().getResource("telefone_sold.jpg"));
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

    public ImageIcon getImageDestaqueGeladeira() {
        return imageDestaqueGeladeira;
    }

    public ImageIcon getImageDestaqueImpresora() {
        return imageDestaqueImpresora;
    }

    public ImageIcon getImageDestaqueSemFoto() {
        return imageDestaqueSemFoto;
    }

    public ImageIcon getImageDestaqueTelefone() {
        return imageDestaqueTelefone;
    }
}
