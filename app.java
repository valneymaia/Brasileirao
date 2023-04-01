public class App {
    public static void main(String[] args)throws Exception {
        //Criando o campeonato
        Campeonato campeonato = new Campeonato();
        // Criando os clubes participantes
        Clube palmeiras = new Clube("Palmeiras  ");
        Clube flamengo = new Clube("Flamengo   ");
        Clube vasco = new Clube("Vasco      ");
        Clube botafogo = new Clube("Botafogo   ");
        Clube santos = new Clube("Santos     ");
        Clube corinthians = new Clube("Corinthians");
        Clube america = new Clube("America    ");
        Clube atleticomg = new Clube("Atletico mg");
        Clube atleticopr = new Clube("Atletico pr");
        Clube coritiba = new Clube("Coritiba   ");
        Clube cruzeiro = new Clube("Cruzeiro   ");
        Clube cuiaba = new Clube("Cuiaba     ");
        Clube bahia = new Clube("Bahia      ");
        Clube fluminense = new Clube("Fluminense ");
        Clube fortaleza = new Clube("Fortaleza  ");
        Clube goais = new Clube("Goais      ");
        Clube gremio = new Clube("Gremio      ");
        Clube bragantino = new Clube("Bragantino  ");
        Clube saopaulo = new Clube("Sao paulo   "); 
        Clube internacional = new Clube("Inter      ");
        //Adicionando os clubes ao campeonato
        campeonato.adicionarClube(palmeiras);
        campeonato.adicionarClube(flamengo);
        campeonato.adicionarClube(vasco);
        campeonato.adicionarClube(botafogo);
        campeonato.adicionarClube(santos);
        campeonato.adicionarClube(corinthians);
        campeonato.adicionarClube(america);
        campeonato.adicionarClube(atleticomg);
        campeonato.adicionarClube(atleticopr);
        campeonato.adicionarClube(coritiba);
        campeonato.adicionarClube(cruzeiro);
        campeonato.adicionarClube(cuiaba);
        campeonato.adicionarClube(bahia);
        campeonato.adicionarClube(fluminense);
        campeonato.adicionarClube(fortaleza);
        campeonato.adicionarClube(goais);
        campeonato.adicionarClube(gremio);
        campeonato.adicionarClube(bragantino);
        campeonato.adicionarClube(saopaulo);
        campeonato.adicionarClube(internacional);
        //jogando o campeonato
        campeonato.jogarCampeonato();
        // imprimndo a tabela de classficacao
        System.out.print("===========================================================\n");
        System.out.print("Tabela do brasileirao  \n"+ campeonato.getClassificacao());
        System.out.print("\n============================================================");
       // imprimindo o campeao
        campeonato.getCampeao();
       
    

    }

}
