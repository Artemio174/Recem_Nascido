/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author netom
 */
public class Recem_Nascido {
    private Integer codigo;
    private String nome_mae;
    private String sexo;
    private Integer numero_quarto;
    private Double peso;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome_mae() {
        return nome_mae;
    }

    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getNumero_quarto() {
        return numero_quarto;
    }

    public void setNumero_quarto(Integer numero_quarto) {
        this.numero_quarto = numero_quarto;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return  nome_mae;
    }
    
    

}
