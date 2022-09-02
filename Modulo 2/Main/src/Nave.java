public class Nave extends ObjetoGrafico{

    private Double velocidad;
    private Integer vida;

    public Nave(Integer posX, Integer posY, Character direccion, Double velocidad, Integer vida) {
        super(posX, posY, direccion);
        this.velocidad = velocidad;
        this.vida = 100;
    }
    public void perderVida(Integer valor){
        this.vida -=valor;
    }


}

