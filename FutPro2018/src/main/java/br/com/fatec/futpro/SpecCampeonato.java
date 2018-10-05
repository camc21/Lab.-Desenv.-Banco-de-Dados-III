package br.com.fatec.futpro;

public class SpecCampeonato
{
    private int ano;
    private String campeao;
    private String viceCampeao;
    private String artilheiro;
    private String pais;
    
    public SpecCampeonato(String ano, String campeao, String viceCampeao, String artilheiro, String pais)
    {
       this.ano = Integer.parseInt(ano);
       this.campeao = campeao.toUpperCase();
       this.viceCampeao = viceCampeao.toUpperCase();
       this.artilheiro = artilheiro.toUpperCase();
       this.pais = pais.toUpperCase();
    }
    
    public void setAnoCampeonato(int novoAnoCampeonato)
    {
        this.ano = novoAnoCampeonato;
    }
    
    public int getAnoCampeonato()
    {
        return ano;
    }
    
    public void setCampeaoCampeonato(String novoCampeaoCampeonato)
    {
       this.campeao = novoCampeaoCampeonato;
    }
    
    public String getCampeaoCampeonato()
    {
        return campeao;
    }
    
    public void setViceCampeaoCampeonato(String novoViceCampeaoCampeonato)
    {
        this.viceCampeao = novoViceCampeaoCampeonato;
    }
    
    public String getViceCampeaoCampeonato()
    {
        return viceCampeao;
    }
    
    public void setArtilheiroCampeonato(String novoArtilheiroCampeonato)
    {
        this.artilheiro = novoArtilheiroCampeonato;
    }
    
    public String getArtilheiroCampeonato()
    {
        return artilheiro;
    }
    
    public void setPaisCampeonato(String novoPaisCampeonato)
    {
        this.pais = novoPaisCampeonato;
    }
    
    public String getPaisCampeonato()
    {
        return pais;
    }
}
