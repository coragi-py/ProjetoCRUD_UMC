package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Fabio Saruwataru
 */
public class produtoDAO {
    
    public void cadastrar(modelo.produto prod) throws ClassNotFoundException, SQLException{
        Connection con = util.conectaBanco.getConexao();
        PreparedStatement comando = con.prepareStatement("insert into produtos (nome, descricao, marca, modelo, serialNumber, quantidade, categoria, cor, valor_varejo, valor_atacado) values (?,?,?,?,?,?,?,?,?,?)");
        comando.setString(1, prod.getNomeItem());
        comando.setString(2, prod.getDescricaoItem());
        comando.setString(3, prod.getMarcaItem());
        comando.setString(4, prod.getModeloItem());
        comando.setString(5, prod.getSerialNumberItem());
        comando.setInt(6, prod.getQuantidadeItem());
        comando.setString(7, prod.getCategoriaItem());
        comando.setString(8, prod.getCorItem());
        comando.setDouble(9, prod.getValorVarejoItem());
        comando.setDouble(10, prod.getValorAtacadoItem());
        comando.execute();
        con.close();
    }
    
    public void apagarPorId(modelo.produto prod) throws ClassNotFoundException, SQLException{
        Connection con = util.conectaBanco.getConexao();
        PreparedStatement comando = con.prepareStatement("delete from produtos where id = ?");
        comando.setInt(1, prod.getIdItem());
        comando.execute();
        con.close();
    }
    
    public void atualizar(modelo.produto prod) throws ClassNotFoundException, SQLException {
        Connection con = util.conectaBanco.getConexao();
        PreparedStatement comando = con.prepareStatement("update produtos set descricao = ?, preco = ? where id = ?");
        comando.setString(1, prod.getNomeItem());
        comando.setDescricao(2, prod.getDescricaoItem());
        comando.setInt(3, prod.getId());
        comando.execute();
        con.close();
    }    
    
    public modelo.produto consultarPorId(modelo.produto prod) throws ClassNotFoundException, SQLException{
        Connection con = util.conectaBanco.getConexao();
        PreparedStatement comando = con.prepareStatement("select * from produtos where id = ?");
        comando.setInt(1, prod.getIdItem());
        ResultSet rs = comando.executeQuery();
        modelo.produto p = new modelo.produto();
        if (rs.next()) {
            p.setIdItem(rs.getInt("id"));
            p.setNomeItem(rs.getString("nome"));
            p.setDescricaoItem(rs.getString("descricao"));
            p.setMarcaItem(rs.getString("marca"));
            p.setModeloItem(rs.getString("modelo"));
            p.setSerialNumberItem(rs.getString("serialNumber"));
            p.setQuantidadeItem(rs.getInt("quantidade"));
            p.setCategoriaItem(rs.getString("categoria"));
            p.setCorItem(rs.getString("cor"));
            p.setValorVarejoItem(rs.getDouble("valor_varejo"));
            p.setValorAtacadoItem(rs.getDouble("valor_atacado"));
        }       
        con.close();
        return p;
    }
    
    public modelo.produto consultarTodos(modelo.produto prod) throws ClassNotFoundException, SQLException{
        Connection con = util.conectaBanco.getConexao();
        PreparedStatement comando = con.prepareStatement("select * from produtos");
        ResultSet rs = comando.executeQuery();
        modelo.produto p = new modelo.produto();
        if (rs.next()) {
            p.setIdItem(rs.getInt("id"));
            p.setNomeItem(rs.getString("nome"));
            p.setDescricaoItem(rs.getString("descricao"));
            p.setMarcaItem(rs.getString("marca"));
            p.setModeloItem(rs.getString("modelo"));
            p.setSerialNumberItem(rs.getString("serialNumber"));
            p.setQuantidadeItem(rs.getInt("quantidade"));
            p.setCategoriaItem(rs.getString("categoria"));
            p.setCorItem(rs.getString("cor"));
            p.setValorVarejoItem(rs.getDouble("valor_varejo"));
            p.setValorAtacadoItem(rs.getDouble("valor_atacado"));
        }       
        con.close();
        return p;
    }
    
}
