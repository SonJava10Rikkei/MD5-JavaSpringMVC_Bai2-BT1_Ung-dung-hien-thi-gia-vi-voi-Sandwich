package rikkei.academy.model;

public class Spices {
    private long id;
    private String name;

    public Spices() {
    }

    public Spices(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Spices{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
