public class Asteroide extends ObjetoGrafico{

    private Integer lesion;

    public Asteroide(Integer posX, Integer posY, Character direccion, Integer lesion) {
        super(posX, posY, direccion);
        this.lesion = lesion;
    }
}
