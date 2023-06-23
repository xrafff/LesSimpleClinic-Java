package teste;

import java.sql.Connection;
import java.sql.SQLException;

import DAO.BaseDAO;

public class TesteConexao {

	public static void main(String[] args) {
		try {
			BaseDAO bDAO = new BaseDAO();
			bDAO.abrir();
			Connection cx = bDAO.getConn();
			if(cx == null){
				System.out.println("CONEX�O NAO ESTABELECIDA");
			}else{
				System.out.println("CONEX�O ESTABELECIDA");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
