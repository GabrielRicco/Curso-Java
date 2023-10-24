package jbdc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarRegistro {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE codigo = ?";
		
		System.out.print("Informe o codigo: ");
		int valor = entrada.nextInt();
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, valor);
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			Pessoa p1 = new Pessoa(codigo, nome);
			
			System.out.println("O nome atual é " + p1.getNome());
			entrada.nextLine();
			
			System.out.print("Informe o novo nome: ");
			String novoNome = entrada.nextLine();
			
			sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
			
			stmt.close();
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, novoNome);
			stmt.setInt(2, valor);
			stmt.execute();
			
			System.out.println("Pessoa alterada com sucesso!");
		} else {
			System.out.println("Pessoa não encontrada!");
		}
		
		entrada.close();
		conexao.close();
	}
}
