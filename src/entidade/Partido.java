package entidade;

import java.util.HashSet;
import java.util.Set;

public class Partido {
    private final int numero;
    private final String sigla;
    private final int federacao;
    private int votosLegenda;
    private Set<Candidato> candidatos = new HashSet<Candidato>();

    public Partido(int numero, String sigla, int federacao) {
        this.numero = numero;
        this.sigla = sigla;
        this.federacao = federacao;
        this.votosLegenda = 0;
    }

    public int getNumero() {
        return numero;
    }

    public String getSigla() {
        return sigla;
    }

    public int getFederacao() {
        return federacao;
    }

    public Set<Candidato> getCandidatos() {
        return new HashSet<>(candidatos);
    }

    public int getVotosLegenda() {
        return votosLegenda;
    }

    public void addCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }

    public void addVotosLegenda(int votosLegenda) {
        this.votosLegenda += votosLegenda;
    }

    @Override
    public String toString() {
        return "Partido [numero=" + numero + ", sigla=" + sigla + ", federacao=" + federacao + ", votosLegenda="
                + votosLegenda + ", candidatos=" + candidatos.size() + "]";
    }

}