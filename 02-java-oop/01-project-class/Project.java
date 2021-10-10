public class Project {
    //Attributes / Fields
    private String name;
    private String description;

    //Methods
    public String elevatorPitch() {
        return this.name + ": " + this.description;
    }

    //Contructors
    public Project() {
        this.name = "Give me a name, please.";
        this.description = "Give me a desc, please.";
    }

    public Project(String name) {
        this.name = name;
        this.description = "Give me a desc, please.";
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //Getters and Setters
    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String description) {
        this.description = description;
    }

}
