
package br.senac.sp.aula5;

/**
 *
 * @author seunome.sobrenome
 */
public class Computador {

    static String fabricante = "Lukas";
    String tipoComputador, sistemaOperacional, HD;
    String[] acessorios, serviços;

    public Computador() {
    

    }

    static String getFabricante() {
        return fabricante;
    }

    public static void setFabricante(String fabricante) {
        Computador.fabricante = fabricante;
    }

    public String getTipoComputador() {
        return tipoComputador;
    }

    public void setTipoComputador(String tipoComputador) {
        this.tipoComputador = tipoComputador;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getHD() {
        return HD;
    }

    public void setHD(String HD) {
        this.HD = HD;
    }

    public String[] getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(String[] acessorios) {
        this.acessorios = acessorios;
    }

    public String[] getServiços() {
        return serviços;
    }

    public void setServiços(String[] serviços) {
        this.serviços = serviços;
    }

}
