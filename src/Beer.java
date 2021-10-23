public class Beer {
    private String name;
    private String type;
    private double alc;

    public Beer(String name, String type, double alc) {
        this.name = name;
        this.type = type;
        this.alc = alc;
    }

    public Beer(String csv){
        this.name = csv.substring(0, csv.indexOf(';'));
        this.type = csv.substring(csv.indexOf(';') + 1, csv.lastIndexOf(';') );
        try {
            this.alc = Double.parseDouble(csv.substring(csv.lastIndexOf(';') + 1)) * 100;
        }catch (NumberFormatException e){
            this.alc = 0;
        }
    }

    @Override
    public String toString() {
        return name + " (" + type + ") " + String.format("%.1f",alc) + "%";
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

    public String getCSV() {
        return getName() + ";" +  getType() + ";" +  getAlc();
    }
}
