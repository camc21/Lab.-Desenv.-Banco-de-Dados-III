package br.com.fatec.futpro;


import java.util.LinkedList;
import java.util.List;

public class Model {
	
	private List<Campeonato> campeonatos = new LinkedList<Campeonato>();
	
	public void addCampeonato(Campeonato campeonato){
		campeonatos.add(campeonato);
	}
	
	public List<Campeonato> buscarPais(String pais){
		List<Campeonato> campeonatosEncontrados = new LinkedList<Campeonato>();
		
		for(Campeonato campeonato:campeonatos){
			if(campeonato.getSpecCampeonato().getPaisCampeonato().toUpperCase().equals(pais.toUpperCase())) campeonatosEncontrados.add(campeonato);
		}
		
		return campeonatosEncontrados;
	}
	
	public List<Campeonato> buscarAno(int ano){
		List<Campeonato> campeonatosEncontrados = new LinkedList<Campeonato>();
		
		for(Campeonato campeonato:campeonatos){
			if(campeonato.getSpecCampeonato().getAnoCampeonato() == ano) campeonatosEncontrados.add(campeonato);
		}
		
		return campeonatosEncontrados;
	}
	
	public List<Campeonato> buscarNome(String nome){
		List<Campeonato> campeonatosEncontrados = new LinkedList<Campeonato>();
		
		for(Campeonato campeonato:campeonatos){
			if(campeonato.getNomeCampeonato().toUpperCase().equals(nome.toUpperCase())) campeonatosEncontrados.add(campeonato);	
		}
		
		return campeonatosEncontrados;
	}
	
	public List<Campeonato> getCampeonatos(){
		return campeonatos;
	}
	
	//MÉTODOS QUE CARREGAM A COMBOBOX PAÍS
	public List<String> retornaPaisesCampeonato() {
		List<String> paises = new LinkedList<String>();
		paises.add("Brasil".toUpperCase());
		paises.add("Inglaterra".toUpperCase());
		paises.add("Espanha".toUpperCase());
		paises.add("Italia".toUpperCase());
		return paises;
	}
	
	//MÉTODOS QUE CARREGAM A COMBOBOX ANO
	public List<Integer> retornaAnosCampeonato() {
		List<Integer> anos = new LinkedList<Integer>();
		for(int i = 1950; i < 2019 ; i++) {
			anos.add(i);
		}
		return anos;
	}
	
	//MÉTODOS QUE CARREGAM A COMBOBOX NOME
	public List<String> retornaNomesCampeonato() {
		List<String> nomes = new LinkedList<String>();
		nomes.add("Brasileiro".toUpperCase());
		nomes.add("Copa do Brasil".toUpperCase());
		nomes.add("Sul Americana".toUpperCase());
		nomes.add("Libertadores".toUpperCase());
		nomes.add("Mundial".toUpperCase());
		return nomes;
	}
}
