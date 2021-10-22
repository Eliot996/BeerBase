public class Beer {
    private final int id;
    private String name;
    private String type;
    private double alc;

    public Beer(int id, String name, String type, double alc) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.alc = alc;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", alc=" + alc +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getAlc() {
        return alc;
    }
}
