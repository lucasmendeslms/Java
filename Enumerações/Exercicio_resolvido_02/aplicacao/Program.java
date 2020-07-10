package aplicacao;

import modulos.*;

import java.util.Date;

import javax.swing.JOptionPane;

//import java.text.SimpleDateFormat;

import java.util.Random;

public class Program {

    public static void main(String[] args) {

        // SimpleDateFormat dataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        JOptionPane.showMessageDialog(null, "No que você está pensando?");

        Date moment = new Date();

        String title = JOptionPane.showInputDialog("Título do Post");

        String content = JOptionPane.showInputDialog("Conteúdo do Post");

        Random numLikes = new Random();

        Integer likes = numLikes.nextInt(1000);

        Post publicacao = new Post(moment, title, content, likes);

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar um comentário no Post?");

        if (resposta == JOptionPane.YES_OPTION) {

            do {

                String text = JOptionPane.showInputDialog("Escreva o comentário");

                Comment comentario = new Comment(text);

                publicacao.addComment(comentario);

                resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar outro comentário?");

            } while (resposta == JOptionPane.YES_OPTION);

        }

        JOptionPane.showMessageDialog(null, " " + publicacao);

    }

}