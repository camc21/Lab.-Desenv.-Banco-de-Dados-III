package br.com.fatec.futpro;

public class Campeonato
{
    private String nome;
    private SpecCampeonato spec;
    
    public Campeonato(String nome, SpecCampeonato spec)
    {
        this.nome = nome.toUpperCase();
        this.spec = spec;
    }
    
    public void setNomeCampeonato( String novoNomeCampeonato)
    {
        this.nome = novoNomeCampeonato;
    }
    
    public String getNomeCampeonato()
    {
        return nome;
    }
    
    public void setSpecCampeonato(SpecCampeonato novaSpecCampeonato)
    {
        this.spec = novaSpecCampeonato;
    }
    
    public SpecCampeonato getSpecCampeonato()
    {
        return spec;
    }
    
   
}
