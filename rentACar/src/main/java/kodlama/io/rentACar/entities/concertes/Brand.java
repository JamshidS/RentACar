package kodlama.io.rentACar.entities.concertes;

public class Brand {
    private String name;
    private int id;

    public Brand(){}
    public Brand(int id, String name){
        this.id=id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

