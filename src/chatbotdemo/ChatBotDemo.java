/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbotdemo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Chatbot extends JFrame {

    private JTextArea ca = new JTextArea();
    private JTextField cf = new JTextField();
    private JButton b = new JButton();
    private JLabel l = new JLabel();

    Chatbot() {    //Contructor for Chatbot, layout and properties are defined here 
        JFrame f = new JFrame();   // Make a chat window using JFrame
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(false);
        f.setLayout(null);
        f.setSize(400, 400);
        f.getContentPane().setBackground(Color.CYAN);
        f.setTitle("ChatBot");
        f.add(ca);       // adding components using .add method
        f.add(cf);
        ca.setSize(300, 310);
        ca.setLocation(1, 1);
        ca.setBackground(Color.BLACK);
        cf.setSize(300, 20);
        cf.setLocation(1, 320);
        f.add(b);
        l.setText("SEND");
        b.add(l);
        b.setSize(400, 20);
        b.setLocation(300, 320);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b) {                           // Message sents on Click button

                    String text = cf.getText().toLowerCase();
                    ca.setForeground(Color.GREEN);
                    ca.append("You-->" + text + "\n");
                    cf.setText("");

                    if (text.contains("hi")) {                         // input Checking
                        replyMeth("Hi there");
                    } else if (text.contains("how are you")) {
                        replyMeth("I'm Good :).Thankyou for asking");
                    } else if (text.contains("what is your name")) {
                        replyMeth("Im the boy who lived");
                    } else if (text.contains("What is your house name?")) {
                        replyMeth("The one who gets free marks from Dubmbledore");
                    } else if (text.contains("Gryffindor")) {
                        replyMeth("CORRECT");
                    } else if (text.contains("POTTERHEAD?")) {
                        replyMeth("ALWAYS AND FOREVER ");
                    } else {
                        replyMeth("I Can't Understand");
                    }

                }

            }

        });

    }

    public void replyMeth(String s) {          //Reply Method                // Reply Method
        ca.append("ChatBot-->" + s + "\n");
    }

}


    


public class ChatBotDemo {   //Driver Class

    public static void main(String[] args) {   //mainclass
        new Chatbot();        //instantiation
    }

}
