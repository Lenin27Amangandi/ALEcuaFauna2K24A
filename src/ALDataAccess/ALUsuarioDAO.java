package ALDataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import ALDataAccess.DTO.ALUsuarioDTO;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ALUsuarioDAO extends SQLiteDataHelper implements IDAO<ALUsuarioDTO> {

    @Override
    public boolean create(ALUsuarioDTO entity) throws Exception {
        String query = "INSERT INTO Usuario ( Usuario, Contraseña, Estado, FechaCrea, FechaModifica) VALUES ( ?, ?, ?, ?, ?)";
        try {
            Connection conn = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            // pstmt.setInt(1, entity.getnAdmin());
            pstmt.setString(1, entity.getUsuario());
            pstmt.setString(2, entity.getContraseña());
            pstmt.setString(3, entity.getEstado());
            pstmt.setString(4, entity.getFechaCrea());
            pstmt.setString(5, entity.getFechaModifica());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        String query = "UPDATE Usuario SET Estado = ? WHERE nAdmin = ?";
        try {
            Connection conn = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "A");
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public Integer getMaxRow() throws Exception {
        String query = "SELECT COUNT(*) FROM Usuario WHERE Estado = 'A'";
        try {
            Connection conn = openConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            throw e;
        }
        return 0;
    }

    @Override
    public List<ALUsuarioDTO> readAll() throws Exception {
        List<ALUsuarioDTO> lst = new ArrayList<>();
        String query = "SELECT nAdmin, Usuario, Contraseña, Estado, FechaCrea, FechaModifica FROM Usuario WHERE Estado = 'A'";
        try (Connection conn = openConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                ALUsuarioDTO usuarioDTO = new ALUsuarioDTO(
                        rs.getInt("nAdmin"),
                        rs.getString("Usuario"),
                        rs.getString("Contraseña"),
                        rs.getString("Estado"),
                        rs.getString("FechaCrea"),
                        rs.getString("FechaModifica"));
                lst.add(usuarioDTO);
            }
        } catch (SQLException e) {
            throw e;
        }
        return lst;
    }

    @Override
    public ALUsuarioDTO readBy(Integer id) throws Exception {
        ALUsuarioDTO usuarioDTO = new ALUsuarioDTO();
        String query = "SELECT nAdmin, Usuario, Contraseña, Estado, FechaCrea, FechaModifica FROM Usuario WHERE Estado = 'A' AND nAdmin = "
                + id;
        try {
            Connection conn = openConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                usuarioDTO = new ALUsuarioDTO(
                        rs.getInt("nAdmin"),
                        rs.getString("Usuario"),
                        rs.getString("Contraseña"),
                        rs.getString("Estado"),
                        rs.getString("FechaCrea"),
                        rs.getString("FechaModifica"));
            }
        } catch (SQLException e) {
            throw e;
        }
        return usuarioDTO;
    }

    @Override
    public boolean update(ALUsuarioDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String query = "UPDATE Usuario SET Usuario = ?, Contraseña = ?, Estado = ?, FechaModifica = ? WHERE nAdmin = ?";
        try {
            Connection conn = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, entity.getUsuario());
            pstmt.setString(2, entity.getContraseña());
            pstmt.setString(3, entity.getEstado());
            pstmt.setString(4, dtf.format(now).toString());
            pstmt.setInt(5, entity.getnAdmin());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }
}