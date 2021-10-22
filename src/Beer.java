public class Beer {
    private String name;
    private String type;
    private double alc;

    public Beer(String name, String type, double alc) {
        this.name = name;
        this.type = type;
        this.alc = alc;
    }

    @Override
    public String toString() {
        return "{" +
                "type='" + type + '\'' +
                ", alc='" + alc + '\'' +
                '}';
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
