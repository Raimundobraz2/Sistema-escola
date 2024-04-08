package Janelas;

import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Alunos {
 private String nome,nota1,nota2,nota3,turma,turmas,media,resultado,media1,resultado1;

    public String getMedia1() {
        return media1;
    }

    public void setMedia1(String media1) {
        this.media1 = media1;
    }

    public String getResultado1() {
        return resultado1;
    }

    public void setResultado1(String resultado1) {
        this.resultado1 = resultado1;
    }

    public String getTurmas() {
        return turmas;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void setTurmas(String turmas) {
        this.turmas = turmas;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

  


   public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNota1() {
        return nota1;
    }

    public void setNota1(String nota1) {
        this.nota1 = nota1;
    }

    public String getNota2() {
        return nota2;
    }

    public void setNota2(String nota2) {
        this.nota2 = nota2;
    }

    public String getNota3() {
        return nota3;
    }

    public void setNota3(String nota3) {
        this.nota3 = nota3;
    }
 
 public void alunos(){
 File pasta = new File(turma);
     if (!pasta.exists()) {
        pasta.mkdir(); 
     }
 
 
 File criar = new File(turma+"/Turmas.txt");
     try {
         criar.createNewFile();
         if (!criar.exists()) {
             criar.createNewFile();
         }
          BufferedWriter b = new BufferedWriter(new FileWriter(criar,true));
          PrintWriter ler = new PrintWriter(b);
        
             ler.println("Nome,Nota1,Nota2,Nota3,Media,Resultado");
             ler.println(nome+","+nota1+","+nota2+","+nota3+","+media1+","+resultado1); 
//             ler.println(nota1+",");
//             ler.println(nota2+",");
//             ler.println(nota3+",");
//             ler.println(turmas+",");
             ler.flush();
             ler.close();
     } catch (IOException ex) {
         Logger.getLogger(Alunos.class.getName()).log(Level.SEVERE, null, ex);
     }
     
}
 
}

