package br.udesc.ceavi.progii.sold.view.frames;

import br.udesc.ceavi.progii.sold.listeners.FrameCadastro1Listeners;
import br.udesc.ceavi.progii.sold.principal.FrameSistema;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 * Esta classe é o modelo de JInternalFrame da Primeira Tela de Cadastro
 *
 * @author Gustavo Santos
 * @version 2.0
 * @see 05/05/2018
 */
public class FrameCadastro1 extends JInternalFramelModelo {

    private Dimension dimensionTextField;
    private JPanel panelFormulario;
    private JLabel lbCPF;
    private JLabel lbData;
    private JLabel lbEmail;
    private JLabel lbID;
    private JLabel lbNome;
    private JLabel lbSenha;
    private JLabel lbSenhaConfirma;
    private JLabel lbTelefone;
    private JPanel panelEndereco;
    private JPanel panelEspaço;
    private JPasswordField pfSenha;
    private JPasswordField pfSenhaConfirma;
    private JTextField tfCPF;
    private JTextField tfData;
    private JTextField tfEmail;
    private JTextField tfID;
    private JTextField tfNome;
    private JTextField tfTelefone;

    private GridBagConstraints cons;

    private FrameEndereco frameInternoEndereco;

    public FrameCadastro1(Dimension dimension, FrameSistema frameSistema) {
        super(dimension, frameSistema);
        initComponents();
        personalizeComponents();
        addComponents();
        super.addBotoesDeAcao();
        FrameCadastro1Listeners listerner = new FrameCadastro1Listeners(frameSistema, this);
        super.addFormulario(panelFormulario);
    }

    private void initComponents() {
        panelFormulario = new JPanel();

        panelFormulario = new JPanel();
        lbData = new JLabel();
        tfData = new JTextField();
        lbTelefone = new JLabel();
        tfTelefone = new JTextField();
        tfID = new JTextField();
        lbEmail = new JLabel();
        lbID = new JLabel();
        pfSenhaConfirma = new JPasswordField();
        lbSenhaConfirma = new JLabel();
        tfEmail = new JTextField();
        lbCPF = new JLabel();
        tfCPF = new JTextField();
        lbNome = new JLabel();
        tfNome = new JTextField();
        panelEndereco = new JPanel();
        panelEspaço = new JPanel();
        lbSenha = new JLabel();
        pfSenha = new JPasswordField();
        frameInternoEndereco = new FrameEndereco();
        tfNome.setPreferredSize(dimensionTextField);
    }

    private void addComponents() {
        panelFormulario.setLayout(new GridBagLayout());

        //Nome >>>>
        //Nome >>>>
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        cons.gridwidth = 2;
        cons.anchor = GridBagConstraints.NORTHWEST;
        panelFormulario.add(lbNome, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 1;
        cons.gridwidth = 4;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.anchor = GridBagConstraints.NORTHWEST;
        panelFormulario.add(tfNome, cons);
        //Nome <<<<<
        //Nome <<<<<

        //Data >>>>>
        //Data >>>>>
        cons = new GridBagConstraints();
        cons.gridx = 5;
        cons.gridy = 0;
        cons.anchor = GridBagConstraints.NORTHWEST;
        panelFormulario.add(lbData, cons);

        cons = new GridBagConstraints();
        cons.gridx = 5;
        cons.gridy = 1;
        cons.gridwidth = 4;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(tfData, cons);
        //Data <<<<
        //Data <<<<

        //Email >>>>>
        //Email >>>>>
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 2;
        cons.anchor = GridBagConstraints.NORTHWEST;
        panelFormulario.add(lbEmail, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 3;
        cons.gridwidth = 4;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.anchor = GridBagConstraints.NORTHWEST;
        panelFormulario.add(tfEmail, cons);
        //Email <<<<
        //Email <<<<

        //Telefone >>>>
        //Telefone >>>>
        cons = new GridBagConstraints();
        cons.gridx = 5;
        cons.gridy = 2;
        cons.gridwidth = 2;
        cons.anchor = GridBagConstraints.NORTHWEST;
        panelFormulario.add(lbTelefone, cons);

        cons = new GridBagConstraints();
        cons.gridx = 5;
        cons.gridy = 3;
        cons.gridwidth = 4;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.anchor = GridBagConstraints.NORTHWEST;
        panelFormulario.add(tfTelefone, cons);
        //Telefone <<<<<
        //Telefone <<<<<

        //ID >>>>>
        //ID >>>>>
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 7;
        cons.anchor = GridBagConstraints.NORTHWEST;
        panelFormulario.add(lbID, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 8;
        cons.gridwidth = 4;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(tfID, cons);
        //ID <<<<<<
        //ID <<<<<<

        //CPF >>>>>
        //CPF >>>>>
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 5;
        cons.anchor = GridBagConstraints.NORTHWEST;
        panelFormulario.add(lbCPF, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 6;
        cons.gridwidth = 4;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(tfCPF, cons);
        //CPF <<<<<
        //CPF <<<<<

        //Formulario de Endereco >>>>>
        //Formulario de Endereco >>>>>
        panelEndereco.add(frameInternoEndereco.getFrameInternoPrincipal());
        frameInternoEndereco.getFrameInternoPrincipal().setVisible(true);
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 9;
        cons.gridwidth = 9;
        cons.gridheight = 3;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(panelEndereco, cons);
        //Formulario de Endereco <<<<<

        //So espaco
        //So espaco
        //So espaco
        panelEspaço.setPreferredSize(new Dimension(50, 0));
        cons = new GridBagConstraints();
        cons.gridx = 4;
        cons.gridy = 1;
        panelFormulario.add(panelEspaço, cons);
        //So espaco
        //So espaco
        //So espaco
        //So espaco
        //So espaco

        //Senha >>>>
        //Senha >>>>
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 12;
        panelFormulario.add(lbSenha, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 13;
        cons.gridwidth = 4;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.anchor = GridBagConstraints.NORTHWEST;
        panelFormulario.add(pfSenha, cons);

        cons = new GridBagConstraints();
        cons.gridx = 5;
        cons.gridy = 13;
        cons.gridwidth = 4;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(pfSenhaConfirma, cons);

        cons = new GridBagConstraints();
        cons.gridx = 5;
        cons.gridy = 12;
        panelFormulario.add(lbSenhaConfirma, cons);
        //Senha <<<<<
        //Senha <<<<<
    }

    private void personalizeComponents() {
        lbNome.setText("Nome:");
        lbTelefone.setText("Telefone:");
        lbEmail.setText("Email:");
        lbSenha.setText("Senha:");
        lbSenhaConfirma.setText("Confirmação de Senha");
        lbData.setText("Data:");
        lbID.setText("ID:");
        lbCPF.setText("CPF:");
        dimensionTextField = new Dimension(155, 20);
        tfData.setPreferredSize(dimensionTextField);
        tfNome.setPreferredSize(dimensionTextField);
        tfID.setEditable(false);
        frameInternoEndereco.getFrameInternoPrincipal().setBorder(null);
        ((BasicInternalFrameUI) frameInternoEndereco.getFrameInternoPrincipal().getUI()).setNorthPane(null);
        panelEndereco.setBorder(BorderFactory.createTitledBorder("Dados De Endereço"));
        getBotoesDeAction().getBtAnterior().setEnabled(false);
    }

    public void limparSenha() {
        pfSenha.setText("");
        pfSenhaConfirma.setText("");
        pfSenha.setBackground(Color.red);
        pfSenhaConfirma.setBackground(Color.red);
    }

    public int gerarID() {
        int num;
        num = (int) (Math.random() * 10000000);
        tfID.setText("" + num);
        return num;
    }

    public JTextField getTfNome() {
        return tfNome;
    }

    public boolean senhaEqual(){
        if(Arrays.equals(pfSenha.getPassword(), new char[]{}) || 
                Arrays.equals(pfSenhaConfirma.getPassword(), new char[]{})){
            return false;
        }
        return Arrays.equals(pfSenha.getPassword(), pfSenhaConfirma.getPassword());
    }
}
