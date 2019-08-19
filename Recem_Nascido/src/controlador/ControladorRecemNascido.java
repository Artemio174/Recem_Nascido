/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoRecemNascido;
import javax.swing.JOptionPane;
import modelo.Recem_Nascido;
import tela.manutencao.ManutencaoRecemNascido;
/**
 *
 * @author netom
 */
public class ControladorRecemNascido {

    public static void inserir(ManutencaoRecemNascido man){
        Recem_Nascido objeto = new Recem_Nascido();
        objeto.setNome_mae(man.jtfnome_mae.getText());
        objeto.setSexo(man.jtfsexo.getText());
        objeto.setNumero_quarto(Integer.parseInt(man.jtfnumero_quarto.getText()));
        objeto.setPeso(Double.parseDouble(man.jtfpeso.getText()));
        
        boolean resultado = DaoRecemNascido.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}

public static void alterar(ManutencaoRecemNascido man){
        Recem_Nascido objeto = new Recem_Nascido();
        //definir todos os atributos
        objeto.setCodigo(Integer.parseInt(man.jtfcodigo.getText()));
        objeto.setNome_mae(man.jtfnome_mae.getText());
        objeto.setSexo(man.jtfsexo.getText());
        objeto.setNumero_quarto(Integer.parseInt(man.jtfnumero_quarto.getText()));
        objeto.setPeso(Double.parseDouble(man.jtfpeso.getText()));
        
        boolean resultado = DaoRecemNascido.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

     public static void excluir(ManutencaoRecemNascido man){
        Recem_Nascido objeto = new Recem_Nascido();
        objeto.setCodigo(Integer.parseInt(man.jtfcodigo.getText())); //só precisa definir a chave primeira
        
        boolean resultado = DaoRecemNascido.excluir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
    
}
