package BusinessLogic.Entities;

import java.util.List;

import ALDataAccess.ALUsuarioDAO;
import ALDataAccess.DTO.ALUsuarioDTO;

public class ALUsuarioBL {

    // En este código, se han agregado dos condiciones en los métodos add y update
    // para asegurarse de que el usuario sea convertido a minúsculas y que la
    // contraseña tenga exactamente 6 letras. Si la contraseña no cumple con esta
    // condición, se lanza una excepción.

    private ALUsuarioDTO alUsuario;
    private ALUsuarioDAO alUsuarioDAO = new ALUsuarioDAO();

    public boolean add(ALUsuarioDTO alUsuarioDTO) throws Exception {
        // Convertir el usuario a minúsculas
        alUsuarioDTO.setUsuario(alUsuarioDTO.getUsuario().toLowerCase());

        // Verificar que la contraseña tenga solo 6 letras
        if (alUsuarioDTO.getContraseña().length() != 6) {
            throw new Exception("La contraseña debe tener exactamente 6 letras");
        }
        return alUsuarioDAO.create(alUsuarioDTO);
    }

    public List<ALUsuarioDTO> getAll() throws Exception {
        List<ALUsuarioDTO> lst = alUsuarioDAO.readAll();
        return lst;
    }

    public boolean update(ALUsuarioDTO alUsuarioDTO) throws Exception {
        // Convertir el usuario a minúsculas
        alUsuarioDTO.setUsuario(alUsuarioDTO.getUsuario().toLowerCase());

        // Verificar que la contraseña tenga solo 6 letras
        if (alUsuarioDTO.getContraseña().length() != 6) {
            throw new Exception("La contraseña debe tener exactamente 6 letras");
        }

        return alUsuarioDAO.update(alUsuarioDTO);
    }

    public boolean delete(Integer id) throws Exception {
        return alUsuarioDAO.delete(id);
    }

    public ALUsuarioDTO getBy(Integer id) throws Exception {
        alUsuario = alUsuarioDAO.readBy(id);
        return alUsuario;
    }

    public Integer getRowCount() throws Exception {
        return alUsuarioDAO.getMaxRow();
    }
}
