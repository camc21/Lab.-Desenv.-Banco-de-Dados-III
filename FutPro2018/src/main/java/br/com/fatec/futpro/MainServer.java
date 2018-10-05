package br.com.fatec.futpro;

import static spark.Spark.port;
import static spark.Spark.staticFileLocation;


public class MainServer {
	
	final static Model model = new Model();
	
    public static void main(String[] args) {

		// Get port config of heroku on environment variable
        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 8088;
        }
        port(port);

		//Servir conteudo html, css e javascript
		staticFileLocation("/static");

		inicializarCarros();

		Controller controller = new Controller(model);
		
		controller.addCamp();
		controller.carregaComboPais();
		controller.carregaComboAno();
		controller.carregaComboNome();
		controller.buscarCampeonatoPais();
		controller.buscarCampeonatoAno();
		controller.buscarCampeonatoNome();
		
    }
    
    public static void inicializarCarros(){
    	
    	model.addCampeonato(new Campeonato("Brasileiro" ,new SpecCampeonato("2018", "Internacional", "Gremio","Romero","Brasil")));
    	model.addCampeonato(new Campeonato("Brasileiro" ,new SpecCampeonato("2017", "Corinthians", "Palmeiras","Jô","Brasil")));
    	model.addCampeonato(new Campeonato("Brasileiro" ,new SpecCampeonato("2016", "Palmeiras", "São Paulo","Não sei","Brasil")));
    	
    	
    }
     
}
