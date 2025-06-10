package config;

import javax.swing.*;

import org.w3c.dom.events.MouseEvent;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.awt.event.*;

public class Mapa {
    private ArrayList<Peca> pecas;
    private JButton[][] casas = new JButton[8][8];
    private JFrame frame;

    public Mapa() {

        frame = new JFrame("Tabuleiro de Xadrez");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(new GridLayout(8, 8));

        for (int linha = 0; linha < 8; linha++) {
            for (int coluna = 0; coluna < 8; coluna++) {
                JButton casa = new JButton();
                casa.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
                casa.setText("♔");
                
                if ((linha + coluna) % 2 == 0) {
                    casa.setBackground(Color.WHITE);
                } else {
                    casa.setBackground(new Color(150, 75, 0)); // Marrom

                }
                frame.add(casa);
            }
        }

        frame.setVisible(true);

    }

}
