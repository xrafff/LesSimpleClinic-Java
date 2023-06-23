package DAO;
import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDAO {
	private static final String USUARIO = "postgres";
    private static final String SENHA = "rafa123";
    private static final String URL = "jdbc:postgresql://localhost:5432/eslab";
    private static final String DRIVER = "org.postgresql.Driver";

    private Connection conn;
     
   	public Connection getConn() {
		return conn;
	}
   	
    public  void abrir() throws Exception {       
        Class.forName(DRIVER);     
        conn = DriverManager.getConnection(URL, USUARIO, SENHA);            
    }

    public  void fechar() throws Exception {
        this.getConn().close();        
    }
       
}