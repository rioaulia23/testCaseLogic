package models;

public class ModelName {
    private final String code;
    private final String name;
    private final String parent;

    public ModelName(String code, String name, String parent) {
        this.code = code;
        this.name = name;
        this.parent = parent;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getParent() {
        return parent;
    }
}