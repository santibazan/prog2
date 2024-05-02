public class Instalacion {
    private String category;
    private String location;
    private String instalationName;
    private String instalationType;
    private sede campus;

    public Instalacion(String category, String location, String instalationName, String instalationType) {
        this.category = category;
        this.location = location;
        this.instalationName = instalationName;
        this.instalationType = instalationType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getInstalationName() {
        return instalationName;
    }

    public void setInstalationName(String instalationName) {
        this.instalationName = instalationName;
    }

    public String getInstalationType() {
        return instalationType;
    }

    public void setInstalationType(String instalationType) {
        this.instalationType = instalationType;
    }

    public sede getCampus() {
        return campus;
    }

    public void setCampus(sede campus) {
        this.campus = campus;
    }
}
