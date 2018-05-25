package br.udesc.ceavi.progii.sold.principal;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuPrincipal extends JMenuBar {

    private JMenuBar menuBar;
    private JMenu menuHome;
    private JMenuItem paginaInicial;
    private JMenuItem paginaCadastro;
    private JMenuItem paginaLogin;
    private JMenu menuProduto;
    private JMenuItem adicionarProduto;
    private JMenuItem removerProduto;
    private JMenu menuSuporte;
    private JMenuItem contato;
    private JMenu menuFerramentas;
    private JMenuItem opcoes;
    private JMenu menuAjuda;
    private JMenuItem relatar;
    private Color cor;
    private Color corPreto;
    private Font fonte;

    public MenuPrincipal(FrameSistema aThis) {
        initializeComponents();
        addComponents();
        super.add(menuBar);
    }

    private void initializeComponents() {
        menuBar = new JMenuBar();
        adicionarProduto = new JMenuItem();
        relatar = new JMenuItem();
        menuAjuda = new JMenu();
        opcoes = new JMenuItem();
        menuFerramentas = new JMenu();
        contato = new JMenuItem();
        menuHome = new JMenu();
        paginaInicial = new JMenuItem();
        paginaCadastro = new JMenuItem();
        paginaLogin = new JMenuItem();
        menuProduto = new JMenu();
        menuSuporte = new JMenu();
        removerProduto = new JMenuItem();
        cor = new Color(250, 226, 110);
        corPreto = new Color(24, 24, 24);
        fonte = new Font("Arial", Font.BOLD, 18);
    }

    private void addComponents() {
        //Criando o menu Home e seus submenus
        menuHome.setText("Home");
        menuHome.setForeground(cor);
        menuHome.setBackground(corPreto);
        menuHome.setFont(fonte);

        paginaInicial.setText("Página Inicial");
        menuHome.add(paginaInicial);
        paginaInicial.setForeground(corPreto);
        paginaInicial.setBackground(cor);
        paginaInicial.setFont(fonte);

        paginaCadastro.setText("Página de Cadastro");
        menuHome.add(paginaCadastro);
        paginaCadastro.setForeground(corPreto);
        paginaCadastro.setBackground(cor);
        paginaCadastro.setFont(fonte);

        paginaLogin.setText("Página de Login");
        menuHome.add(paginaLogin);
        paginaLogin.setForeground(corPreto);
        paginaLogin.setBackground(cor);
        paginaLogin.setFont(fonte);

        //Criando o menu Produto e seus submenus
        menuProduto.setText("Produto");
        menuProduto.setForeground(cor);
        menuProduto.setBackground(corPreto);
        menuProduto.setFont(fonte);

        adicionarProduto.setText("Adicionar");
        menuProduto.add(adicionarProduto);
        adicionarProduto.setForeground(corPreto);
        adicionarProduto.setBackground(cor);
        adicionarProduto.setFont(fonte);

        removerProduto.setText("Remover");
        menuProduto.add(removerProduto);
        removerProduto.setForeground(corPreto);
        removerProduto.setBackground(cor);
        removerProduto.setFont(fonte);

        //Criando o menu Suporte e seus submenus
        menuSuporte.setText("Suporte");
        menuSuporte.setForeground(cor);
        menuSuporte.setBackground(corPreto);
        menuSuporte.setFont(fonte);

        contato.setText("Contato");
        menuSuporte.add(contato);
        contato.setForeground(corPreto);
        contato.setBackground(cor);
        contato.setFont(fonte);

        //Criando o menu Ferramentas e seus submenus
        menuFerramentas.setText("Ferramentas");
        menuFerramentas.setForeground(cor);
        menuFerramentas.setBackground(corPreto);
        menuFerramentas.setFont(fonte);

        opcoes.setText("Opções");
        menuFerramentas.add(opcoes);
        opcoes.setForeground(corPreto);
        opcoes.setBackground(cor);
        opcoes.setFont(fonte);

        //Criando o menu Ajuda e seus submenus
        menuAjuda.setText("Ajuda");
        menuAjuda.setForeground(cor);
        menuAjuda.setBackground(corPreto);
        menuAjuda.setFont(fonte);

        relatar.setText("Relatar problema");
        menuAjuda.add(relatar);
        relatar.setForeground(corPreto);
        relatar.setBackground(cor);
        relatar.setFont(fonte);

        //Adicionando os menus criados ao JMenuBar
        menuBar.add(menuHome);
        menuBar.add(menuProduto);
        menuBar.add(menuSuporte);
        menuBar.add(menuFerramentas);
        menuBar.add(menuAjuda);
        menuBar.setBackground(corPreto);
    }

    public JMenuBar getMenuBar() {
        return menuBar;
    }
}
