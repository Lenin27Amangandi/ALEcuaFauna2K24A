package ALDataAccess.DTO;

public class ALUsuarioDTO {
    private Integer nAsmin;
    private String usuario;
    private String contraseña;
    private String estado;
    private String fechaCrea;
    private String fechaModifica;

    public ALUsuarioDTO(Integer nAsmin, String usuario, String contraseña, String estado, String fechaCrea,
            String fechaModifica) {

        this.nAsmin = nAsmin;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.estado = estado;
        this.fechaCrea = fechaCrea;
        this.fechaModifica = fechaModifica;
    }

    public ALUsuarioDTO(
            String usuario, String contraseña) {

        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public ALUsuarioDTO() {
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "\n nAdmin:         " + getnAdmin() +
                "\n usuario:       " + getUsuario() +
                "\n contraseña:      " + getContraseña() +
                "\n estado:            " + getEstado() +
                "\n fechaCrea:         " + getFechaCrea() +
                "\n fechaModifica:     " + getFechaModifica() + "\n";
    }

    public Integer getnAdmin() {
        return nAsmin;
    }

    public void setnAdmin(Integer nAsmin) {
        this.nAsmin = nAsmin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaCrea() {
        return fechaCrea;
    }

    public void setFechaCrea(String fechaCrea) {
        this.fechaCrea = fechaCrea;
    }

    public String getFechaModifica() {
        return fechaModifica;
    }

    public void setFechaModifica(String fechaModifica) {
        this.fechaModifica = fechaModifica;
    }

}
