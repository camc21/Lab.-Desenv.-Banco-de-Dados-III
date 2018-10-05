package br.com.fatec.futpro;

import static spark.Spark.get;

import java.util.List;

import com.google.gson.Gson;

//import spark.Route;

public class Controller {
	
	private Model model;
	
	
	public Controller(Model model){
		this.model = model;
	}
	
	public void buscarCampeonatoPais() {
		get("/campeonato/busca/pais/:pais", (req,res) -> {
			
			List<Campeonato> campeonatosEncontrados = model.buscarPais(req.params(":pais"));
			return new Gson().toJson(campeonatosEncontrados);
		});
	}
	
	public void buscarCampeonatoAno() {
		get("/campeonato/busca/ano/:ano", (req,res) -> {
			
			List<Campeonato> campeonatosEncontrados = model.buscarAno(Integer.parseInt(req.params(":ano")));
			return new Gson().toJson(campeonatosEncontrados);
		});
	}
	
	public void buscarCampeonatoNome() {
		get("/campeonato/busca/nome/:nome", (req,res) -> {
			
			List<Campeonato> campeonatosEncontrados = model.buscarNome(req.params(":nome"));
			return new Gson().toJson(campeonatosEncontrados);
		});
	}
	
	public void addCamp() {
		get("/campeonato/cadastro/:nome/:ano/:campeao/:vice/:artilheiro/:pais", (req,res) -> {
			
			model.addCampeonato(new Campeonato(req.params(":nome"), new SpecCampeonato(req.params(":ano"), req.params(":campeao"), req.params(":vice"), req.params(":artilheiro"), req.params(":pais"))));

			return null;
		});
	}
	
	public void carregaComboPais() {
		get("/campeonato/combo/pais/", (req,res) -> {
			List<String> lista = model.retornaPaisesCampeonato();
			return new Gson().toJson(lista);
		});
	}
	
	public void carregaComboAno() {
		get("/campeonato/combo/ano/", (req,res) -> {
			List<Integer> lista = model.retornaAnosCampeonato();
			return new Gson().toJson(lista);
		});
	}
	
	public void carregaComboNome() {
		get("/campeonato/combo/nome/", (req,res) -> {
			List<String> lista = model.retornaNomesCampeonato();
			return new Gson().toJson(lista);
		});
	}
	
}
