/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;
/**
 *
 * @author levi
 */
import java.util.Scanner;
public class Jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Jogador;
        Scanner ler=new Scanner(System.in);
        Jogador=("           ");
        System.out.println("------Jogo dos JARROS-----\n");
        System.out.println("Objetivo: encher um dos jarros com 4 litros");
        System.out.println("------"+Jogador+"-----\n");
        System.out.println("Digite o nome do Jogador:\n");
        Jogador=ler.next();
        //criar os objetos
        Jogador player1 = new Jogador(Jogador);
        Jarro   j1 = new Jarro(5,0,1);
        Jarro   j2 = new Jarro(3,0,2);
        ///////////////
        //desenhando os jarros
        System.out.println(" |     |\n |     |\n |     |     |     |\n |     |     |     |\n |_____|     |_____|\n");
        System.out.println("Jarro "+j1.get_indice()+"-"+j1.get_tamanho()+"L   e   Jarro "+j2.get_indice()+"-"+j2.get_tamanho()+" L");
        ////////////////
        String op;
        int jarro_selecionado;
        while(j1.get_volume_agua()!=4 && j2.get_volume_agua()!=4){
            System.out.println("Qual jarro deseja escolher?");
            jarro_selecionado=ler.nextInt();
            System.out.println("Qual ação deseja?\n");
            System.out.println("(E)ncher, E(s)vaziar, (T)rocar");
            op=ler.next();
            if (jarro_selecionado==1){
                if (op.compareTo("E")==0){
                    player1.encher(j1);
                }else if(op.compareTo("s")==0){
                    player1.esvaziar(j1);
                }else if(op.compareTo("T")==0){
                    player1.trocar(j1, j2);
                }
            }else if (jarro_selecionado==2){
                if (op.compareTo("E")==0){
                    player1.encher(j2);
                }else if(op.compareTo("s")==0){
                    player1.esvaziar(j2);
                }else if(op.compareTo("T")==0){
                    player1.trocar(j2, j1);
                }
            }
            System.out.println("Jarro"+j1.get_indice()+"com "+j1.get_volume_agua()+"L e Jarro"+j2.get_indice()+"com "+j2.get_volume_agua()+" L" );
        }
        System.out.println("Parabéns! você venceu!");
    }
    
}
