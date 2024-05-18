import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Tela extends JFrame {
        Banco cliente = new Banco();
        
        JPanel panel = new JPanel();
        JLabel jLabel = new JLabel("Nome:");
        JTextField textField = new JTextField(15);
        JButton salvarButton = new JButton("Salvar");
        //componentes gráficos depositar e sacar
        JButton jButton2 = new JButton("Depositar");
        JButton jButton = new JButton("Sacar");
        JLabel jLabel2 = new JLabel(String.valueOf(cliente.getSaldo()));
        JLabel jLabel3 = new JLabel("Seu valor de saldo =");

       
        

        public Tela(){
            this.setTitle("*** Simulação banco ***");
            this.setSize(300,200);
            panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
            panel.setBackground(Color.GRAY);

            add(panel);
            // configurando o espaço do nome
            panel.add(jLabel);
            panel.add(textField);
            panel.add(salvarButton);

            // Configurando o espaço depsositar
            JPanel outraLinha = new JPanel(new FlowLayout(FlowLayout.CENTER,10,5));
            outraLinha.setBackground(Color.gray);
            panel.add(outraLinha);
            outraLinha.add(jButton2);
            outraLinha.add(jButton);   

            // espaço do saldo sendo mostrado

            JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER,10,5));
            panel2.setBackground(Color.gray);
            panel.add(panel2);
            panel2.add(jLabel3);
            panel2.add(jLabel2);
            
            
            
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(true);
            this.setLocationRelativeTo(null);
            this.revalidate();
            this.repaint();

            // configurndo butão salvar para salvar o nome da pessoa

            salvarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    String nome = textField.getText();
                    

                    cliente.setNome(nome);
                    JOptionPane.showMessageDialog(null, cliente.getNome());
                } 
            });

            jButton2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    double valorDepositado = 0.0;
                   try{ 
                    String valor = JOptionPane.showInputDialog(null,"Escreva o valor de deposito"
                    ,"***Deposito***",JOptionPane.INFORMATION_MESSAGE);
                    valorDepositado = Double.parseDouble(valor);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Você não passou um numero "+ ex);
                    return;

                }
                if(valorDepositado < 0){
                    JOptionPane.showMessageDialog(null, "valor inválido","***Deposito***",JOptionPane.ERROR_MESSAGE);

                }else{
                    cliente.depositar(valorDepositado);
                    jLabel2.setText(String.valueOf(cliente.getSaldo()));
                }
                
                }
            });

            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    double valorSacado = 0.0;

                    String sacar = JOptionPane.showInputDialog(null,"Qual o valor a ser sacado? "
                    ,"***Sacar",JOptionPane.INFORMATION_MESSAGE);

                    try{
                        valorSacado = Double.parseDouble(sacar);
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, "Você não passou um numero "+ ex);
                    return;
                    }

                    if(valorSacado > cliente.getSaldo()){
                        JOptionPane.showMessageDialog(null,"Você não possui esse valor na conta corrente","***Sacar***",JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                    cliente.sacar(valorSacado);
                    jLabel2.setText(String.valueOf(cliente.getSaldo()));

                }
            });


        }

        public static void main(String[] args){
            new Tela();
        }

    }
