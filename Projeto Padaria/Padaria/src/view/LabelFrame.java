package view;
// Fig. 12.6: LabelFrame.java
// JLabels with text and icons.
import java.awt.*; // specifies how components are arranged
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.FlowLayout;
import java.awt.Color;

import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;



public class LabelFrame extends JFrame 
{
   private final JLabel label1; // JLabel with just text
   private final JLabel label2;
 

   // LabelFrame constructor adds JLabels to JFrame
   
   public LabelFrame()
   {
      super("Padoka do Felps");
      setLayout(new FlowLayout()); // set frame layout

      String bemVindoVariavel2 = ViewBemVindo.bemVindoVariavel;
      // JLabel constructor with a string argument
      label1 = new JLabel(bemVindoVariavel2);
      add(label1); // add label1 to JFrame

     ButtonFrame();
   }
   public LabelFrameVerCardapio()
   {
      super("Padoka do Felps - Cardápio");
      setLayout(new FlowLayout()); // set frame layout

      // JLabel constructor with a string argument
      label1 = new JLabel("Item 1");
      add(label2); // add label1 to JFrame

     ButtonFrame();
   }

   JButton botaoVerCardapio, botaoVerPedidos, botaoVerCarrinho, botaoSairDoSistema; // button with just text
  

   // ButtonFrame adds JButtons to JFrame
   public void ButtonFrame()
   {
      botaoVerCardapio = new JButton("Ver cardápio"); // button with text
      add(botaoVerCardapio); // add plainJButton to JFrame

      botaoVerPedidos = new JButton("Ver pedidos");
      add(botaoVerPedidos);

      botaoVerCarrinho = new JButton("Ver carrinho");
      add(botaoVerCarrinho);

      botaoSairDoSistema = new JButton("Sair do sistema");
      add(botaoSairDoSistema);
     
      ButtonHandler handler = new ButtonHandler();
      
      botaoVerCardapio.addActionListener(handler);
      botaoVerPedidos.addActionListener(handler);
      botaoVerCarrinho.addActionListener(handler);
      botaoSairDoSistema.addActionListener(handler);

      getContentPane().setBackground(Color.gray);
   }

   // inner class for button event handling
   private class ButtonHandler implements ActionListener 
   {
      final JLabel item1 = new JLabel("Bolo de Maçã");
      final JLabel item2 = new JLabel("Bolo de Cenoura");
      
      @Override
      public void actionPerformed(ActionEvent event)
      {

         String funcaoDoBotao = event.getActionCommand(); // por exemplo: "Ver cardápio"

         if (funcaoDoBotao.equals("Ver cardápio")) {
            JOptionPane.showMessageDialog(LabelFrame.this, String.format("teste"));
         }

         if (funcaoDoBotao.equals("Ver pedidos")) {
            
         }

      }
   } 

    
} // end class LabelFrame


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
