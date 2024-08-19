import java.util.List;

import ALDataAccess.ALHormigaDAO;
import ALDataAccess.ALUsuarioDAO;
import ALDataAccess.DTO.ALCatalogoDTO;
import ALDataAccess.DTO.ALHormigaDTO;
import ALDataAccess.DTO.ALUsuarioDTO;
import BusinessLogic.Entities.ALUsuarioBL;
import UserInterface.Forms.ALMain;
import UserInterface.Forms.ALMenuPanel;
import UserInterface.Forms.MenuFormulario;
import UserInterface.Forms.SplashAPP;

public class App {
    public static void main(String[] args) throws Exception {

        // new MenuFormulario("2k24 Hormigero");

        try {

            // SplashAPP.show();
            new MenuFormulario("2k24 Hormigero");

        } catch (Exception e) {
            System.out.println("Losiento no se pudo");
        }

        // ALMain formulario = new ALMain("EcuaFauna 2K24A");

        // try {
        // ALHormigaDAO hoorDAO = new ALHormigaDAO();
        // for (ALHormigaDTO hormiga : hoorDAO.readAll()) {
        // System.out.println(hormiga);
        // }
        // } catch (Exception e) {
        // System.err.println("Error al leer las hormigas: " + e.getMessage());
        // e.printStackTrace();
        // }

        // ALHormigaDTO s = new ALHormigaDTO();
        // s.setTipoHormiga(4);
        // s.setSexo(6);
        // s.setProvincia(4);
        // s.setGenoAlimento(4);
        // s.setIngestaNativa(4);
        // s.setEstado("Viva");
        // ALHormigaDAO oH = new ALHormigaDAO();
        // oH.create(s);
        // System.out.println(oH.readBy(2).toString());
        // Funciona para buscar con readby
        // System.out.println(oH.readBy(4));

        // try {
        // ALUsuarioBL usuarioBL = new ALUsuarioBL();
        // for (ALUsuarioDTO usuario : usuarioBL.readAll()) {
        // System.out.println(usuario);
        // }
        // } catch (Exception e) {
        // System.err.println("Error al leer los usuarios " + e.getMessage());
        // e.printStackTrace();
        // }

        // ALHormigaDTO s = new ALHormigaDTO();
        // s.setTipoHormiga(4);
        // s.setSexo(6);
        // s.setProvincia(4);
        // s.setGenoAlimento(4);
        // s.setIngestaNativa(4);
        // s.setEstado("Viva");
        // ALHormigaDAO oH = new ALHormigaDAO();
        // oH.create(s);
        // System.out.println(oH.readBy(2).toString());
        // Funciona para buscar con readby
        // System.out.println(oH.readBy(4));

        // Creamos a los Usuarios

        // ALUsuarioDTO usua=new ALUsuarioDTO();
        // usua.setUsuario("Kilik");
        // usua.setContraseña("123457");
        // ALUsuarioBL oU = new ALUsuarioBL();
        // oU.create(usua);

        // // ALUsuarioBL oU = new ALUsuarioBL();
        // System.out.println(oU.readBy(1));
        // System.out.println(oU.readBy(2));
        // System.out.println(oU.readBy(3));

        // try {
        // ALUsuarioBL usuarioBL = new ALUsuarioBL();
        // for (ALUsuarioDTO usuario : usuarioBL.readAll()) {
        // System.out.println(usuario);
        // }
        // } catch (Exception e) {
        // System.err.println("Error al leer los usuarios " + e.getMessage());
        // e.printStackTrace();
        // }

        // vamos von la bl
        // Funciona para poder crear usuarios
        // try {
        // ALUsuarioBL usuarioBL = new ALUsuarioBL();
        // usuarioBL.add(new ALUsuarioDTO("ITADORI", "124578"));
        // for (ALUsuarioDTO usuario : usuarioBL.getAll()) {
        // System.out.println(usuario.toString());
        // }
        // } catch (Exception e) {
        // System.err.println("Error al leer los usuarios " + e.getMessage());
        // }
    }

}
