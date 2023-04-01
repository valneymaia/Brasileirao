import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Campeonato {
    private List<Clube> clubes;

    public Campeonato() {
        this.clubes = new ArrayList<Clube>();
    }
    //adicionar os clubes criados
    public void adicionarClube(Clube clube){
        this.clubes.add(clube);
    }
    //faz o arranjo das partidas mandante e visitante
    public void jogarCampeonato(){
        for(Clube m : clubes) {
            for(Clube v : clubes) {
                Clube clubeMandante = m;
                Clube clubeVisitante = v;
                if(clubeMandante != clubeVisitante) {
                    jogarPartida(clubeMandante,clubeVisitante);
                }
            }
        }
    }
    //sorteia os numeros de gols do mandante e visitantee faz verificao dos resultados
    private void jogarPartida(Clube clubeMandante, Clube  clubeVisitante){
        Random rand = new Random();
        int golsM= rand.nextInt(6);
        int golsV= rand.nextInt(6);
        //printa o resultados das partidas dos mandantes e visitante
        System.out.println(clubeMandante.nomeTime + " " + golsM + " X " + golsV + " " + clubeVisitante.nomeTime );
        //checar os gols e salva o resultado da partida
        if(golsM>golsV){
            clubeMandante.ganharJogo(golsM, golsV);
            clubeVisitante.perderJogo(golsV, golsM);
        }else if (golsM<golsV){
            clubeMandante.perderJogo(golsM, golsV);
            clubeVisitante.ganharJogo(golsV, golsM);
        }else{
            clubeMandante.empatarJogo(golsM, golsV);
            clubeVisitante.empatarJogo(golsV, golsM);
        }
    }
   
    public String getClassificacao() {
        Collections.sort(clubes, Clube.comparePontos);
       // for(Clube clube : clubes) {  //teste de ordenaçao quando empatava nos pontos
        //    System.out.println(clube.getNomeTime() + "Pontos: " + clube.getPontos() + ", saldo de gols: " + clube.getSaldodeGols());
       // }
        Collections.sort(clubes, Clube.compareSaldo);
         StringBuilder sb = new StringBuilder();
         int posicao = 1;
        for (Clube clube : clubes) {
            sb.append("\n"+posicao + ". " + clube.getNomeTime() + " - |Pontos: " + clube.getPontos() + "  |Saldo de gols: " + clube.getSaldodeGols() +"|");
            posicao++;
        } 
    return sb.toString();
    }

   public String getCampeao() {
        StringBuilder sb = new StringBuilder();
        sb.append("\tPARABENS CAMPEAO: "+ clubes.get(0).getNomeTime());
        sb.append("\n============================================================");
        int n = clubes.size();
        for(n =0; n < 4 ; n++){
            sb.append("\nclasificados para libertadores: "+ clubes.get(n).getNomeTime());
        }
        sb.append("\n============================================================");
        for(n = 4; n < 6 ; n++){
            sb.append("\nclasificados para pre-libertadores: "+ clubes.get(n).getNomeTime());
        }
        sb.append("\n============================================================");
        for(n =6; n < 12 ; n++){
            sb.append("\nclasificados para sula-americana: "+ clubes.get(n).getNomeTime());
        }
        sb.append("\n============================================================");
        for(n =16; n < 20; n++){
            sb.append("\nrebaixado para serie B: "+ clubes.get(n).getNomeTime());
        }
        return sb.toString();
   }
}

   
