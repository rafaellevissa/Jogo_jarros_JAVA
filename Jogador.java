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
public class Jogador {
    //Atributos:
    
    private String Nome;
    private int Movimentos;
    private int Score;
    
    //Métodos:
    //gets:
    public String get_Nome(){
        return this.Nome;        
    }
    public int get_Movimentos(){
        return this.Movimentos;        
    }
    public int get_Score(){
        return this.Score;
    }
    //sets:
    public void set_Nome(String nome_Jogador){
        this.Nome= nome_Jogador;        
    }
    public void set_Movimentos(){
        this.Movimentos=this.Movimentos+1;        
    }
    public void set_Score(int score_Jogador){
        this.Score= score_Jogador;        
    }
    //Contrutor:
    public Jogador(String nome){
        this.Nome=nome;
        this.Movimentos=0;
        this.Score=0;
    }
    //Destrutor
    @Override
    protected void finalize(){
        System.out.println("Jogador excluido");        
    }    
    //encher jarro
    public void encher (Jarro oJarro){
        int volume_total;
        volume_total=oJarro.get_tamanho();
        oJarro.set_volume_agua(volume_total);
    }    
    //Esvaziar o jarro:
    public void esvaziar(Jarro oJarro){
        oJarro.set_volume_agua(0);
    }
    //Trocar (jarro de origem, jarro de destino)
    public void trocar(Jarro oJarro1, Jarro oJarro2){
        int volume1, volume2, tamanho1, tamanho2, resto1;
        volume1=oJarro1.get_volume_agua();
        volume2=oJarro2.get_volume_agua();
        tamanho1=oJarro1.get_tamanho();
        tamanho2=oJarro2.get_tamanho();
        if (volume1>0){
            if(tamanho2-volume2>=volume1){
                oJarro2.set_volume_agua(volume2+volume1);
                oJarro1.set_volume_agua(0);
            }else{
                resto1=volume1-(tamanho2-volume2);
                oJarro1.set_volume_agua(resto1);
                oJarro2.set_volume_agua(tamanho2);
            }        
        }        
    }
}
