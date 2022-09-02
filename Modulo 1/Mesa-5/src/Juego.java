public class Juego {

    private String nombre;
    private String clave;
    private Integer Puntaje;
    private Integer nivel;

    public Juego(String clave, String nombre) {
        this.clave = clave;
        this.nombre = nombre;
        this.nivel = 0;
        this.Puntaje = 0;
    }

    public void usuarioNivel(){
        this.nivel ++;
    }
    public void usuarioPuntaje(){
        this.Puntaje ++;
    }
    public void Bonus(Integer amount){
        this.Puntaje += amount;
        this.nivel += amount/2;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public Integer getNivel() {
        return nivel;
    }

    public Integer getPuntaje() {
        return Puntaje;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
}
