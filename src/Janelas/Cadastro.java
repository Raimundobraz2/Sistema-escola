package Janelas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
 

public class Cadastro {
  private String nome,apelido,senha, email, confirmasenha;
  boolean entra=false;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfirmasenha() {
        return confirmasenha;
    }

    public void setConfirmasenha(String confirmasenha) {
        this.confirmasenha = confirmasenha;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

     public void cadastro_escrever(){
    File pasta = new File(nome);
    pasta.mkdir();
   
   try{
        File criar = new File(nome+"/Usuario.txt");
       criar.createNewFile();
//        if (!criar.exists()) {
//            
//        }
        PrintWriter ler = new PrintWriter(criar);
        ler.println(nome);
        ler.println(senha);
        ler.println(confirmasenha);
        ler.println(email);
        ler.println(apelido);
        ler.flush();
        ler.close();
    }catch(Exception ex){
        JOptionPane.showInputDialog("Erro");
    }    
        
    }

    public boolean getEntra() {
        return entra;
    }

    public void setEntra(boolean entra) {
        this.entra = entra;
    }
     public void cadastro_ler(){
//        ArrayList <String> ler1=new ArrayList();
        String ler1[] =new String[5] ; 
           try{
               BufferedReader ler2=new BufferedReader(new FileReader(nome+"/Usuario.txt"));
               while (ler2.ready()) {
                  ler1[0]=ler2.readLine();
                  ler1[1]=ler2.readLine();
                  ler1[2]=ler2.readLine();
                  ler1[3]=ler2.readLine();
                  ler1[4]=ler2.readLine();
                  ler1[4]=ler2.readLine();
                   if (ler1[0].equals(nome)&&ler1[1].equals(senha)&&ler1[3].equals(email))
                   {
                     entra=true;
                    
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,"3ro");      
                   } 
                
               }
           }
           catch(Exception ex){
               System.out.println(ex.getMessage());
           }
     }
    
  
}
