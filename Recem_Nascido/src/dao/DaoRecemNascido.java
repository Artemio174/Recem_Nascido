/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Recem_Nascido;
/**
 *
 * @author netom
 */
public class DaoRecemNascido {
     public static boolean inserir(Recem_Nascido objeto) {
        String sql = "INSERT INTO Recem_Nascido (nome_mae, sexo, numero_quarto, peso) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNome_mae());
            ps.setString(2, objeto.getSexo());
            ps.setInt(3, objeto.getNumero_quarto());
            ps.setDouble(4, objeto.getPeso());

            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
public static void main(String[] args) {
        Recem_Nascido objeto = new Recem_Nascido();
        objeto.setNome_mae("Maria");
        objeto.setSexo("M");
        objeto.setNumero_quarto(1);
        objeto.setPeso(13.2);
       
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
  public static boolean alterar(Recem_Nascido objeto) {
        String sql = "UPDATE Recem_Nascido SET nome_mae = ?, sexo = ?, numero_quarto = ?, peso = ? WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNome_mae());
            ps.setString(2, objeto.getSexo());
            ps.setInt(3, objeto.getNumero_quarto());
            ps.setDouble(4, objeto.getPeso());
            ps.setInt(5, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public static boolean excluir(Recem_Nascido objeto) {
        String sql = "DELETE FROM Recem_Nascido WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
