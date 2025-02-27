package consultorio_gabriel_sousa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    private Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }

    public Usuario login(String username, String password) {
        Usuario usuario = null;
        String query = "SELECT * FROM usuario WHERE username = ? AND password = ?";
        try (PreparedStatement st = connection.prepareStatement(query)) {
            st.setString(1, username);
            st.setString(2, password);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    usuario = new Usuario();
                    usuario.setUsername(rs.getString("username"));
                    usuario.setRole(rs.getString("role"));
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao autenticar: " + ex.getMessage());
        }
        return usuario;
    }
}
