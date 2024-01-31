package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabelFrame extends JFrame {
   private final JLabel label1; // JLabel with just text
   private JButton menuJButton, cardapioJButton, pedidoJButton, carrinhoJButton; // button with just text

   // LabelFrame constructor adds JLabels to JFrame
   public LabelFrame() {
      super("Padaria");
      setLayout(new FlowLayout()); // set frame layout

      String bemVindoVariavel2 = ViewBemVindo.str1;
      // JLabel constructor with a string argument
      label1 = new JLabel(bemVindoVariavel2);
      add(label1); // add label1 to JFrame

      ButtonFrame();
   }

   // ButtonFrame adds JButtons to JFrame
   public void ButtonFrame() {
      menuJButton = new JButton("Menu"); // button with text
      add(menuJButton); // add plainJButton to JFrame

      cardapioJButton = new JButton("Cardápio"); // button with text
      add(cardapioJButton); // add plainJButton to JFrame

      pedidoJButton = new JButton("Fazer pedido"); // button with text
      add(pedidoJButton); // add plainJButton to JFrame

      carrinhoJButton = new JButton("Ver Carrinho"); // button with text
      add(carrinhoJButton); // add plainJButton to JFrame

      ButtonHandler handler = new ButtonHandler();
      menuJButton.addActionListener(handler);
      cardapioJButton.addActionListener(handler);
      pedidoJButton.addActionListener(handler);
      carrinhoJButton.addActionListener(handler);
   }

   // inner class for button event handling
   private class ButtonHandler implements ActionListener {
      // handle button event
      public void actionPerformed(ActionEvent event) {
         if (event.getSource() == menuJButton) {
            JOptionPane.showMessageDialog(LabelFrame.this, String.format("Você já está no menu, pode fechar essa página"));
         }
         if (event.getSource() == cardapioJButton) {
            // Exibir um JOptionPane com uma JComboBox
            JComboBox<String> comboBox = new JComboBox<>();
            comboBox.addItem("Pão Francês");
            comboBox.addItem("Baguete");
            comboBox.addItem("Pão de forma");
            comboBox.addItem("Pão de forma integral");
            JOptionPane.showMessageDialog(LabelFrame.this, comboBox, "Selecione um item", JOptionPane.PLAIN_MESSAGE);
         }
         if (event.getSource() == carrinhoJButton) {
            // Exibir um JOptionPane com uma JComboBox
            JComboBox<String> comboBox = new JComboBox<>();
            comboBox.addItem("Pão Francês");
            comboBox.addItem("Baguete");
            comboBox.addItem("Pão de forma");
            comboBox.addItem("Pão de forma integral");
            JOptionPane.showMessageDialog(LabelFrame.this, comboBox, "Selecione um item", JOptionPane.PLAIN_MESSAGE);
         }
         if (event.getSource() == cardapioJButton) {
            // Exibir um JOptionPane com uma JComboBox
            JComboBox<String> comboBox = new JComboBox<>();
            comboBox.addItem("Pão Francês");
            comboBox.addItem("Baguete");
            comboBox.addItem("Pão de forma");
            comboBox.addItem("Pão de forma integral");
            JOptionPane.showMessageDialog(LabelFrame.this, comboBox, "Selecione um item", JOptionPane.PLAIN_MESSAGE);
         }
         if (event.getSource() == pedidoJButton) {
            // Exibir um JOptionPane com uma JComboBox
            JComboBox<String> comboBox = new JComboBox<>();
            comboBox.addItem("Pão Francês");
            comboBox.addItem("Baguete");
            comboBox.addItem("Pão de forma");
            comboBox.addItem("Pão de forma integral");
            JOptionPane.showMessageDialog(LabelFrame.this, comboBox, "Selecione um item", JOptionPane.PLAIN_MESSAGE);
         }
      }
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> {
         LabelFrame frame = new LabelFrame();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(600, 300);
         frame.setVisible(true);
      });
   }
}