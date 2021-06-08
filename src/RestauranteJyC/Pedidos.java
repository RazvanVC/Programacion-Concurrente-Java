package RestauranteJyC;

public class Pedidos { //clase pedidos solo sirve para el getId y setId
    
    private String id;

    Pedidos(String string) {
        this.id = string;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
