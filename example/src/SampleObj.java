public class SampleObj {
    private int index;
    private String name;
    private String grade;

    SampleObj() {}

    // getter
    public int getIndex() {
        return index;
    }
    public String getName() {
        return name;
    }
    public String getGrade() {
        return grade;
    }

    // setter
    public void setIndex(int index) {
        this.index = index;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return (String.format("index: %d,\nname: %s, \ngrade: %s\n", this.index, this.name, this.grade));
    }
}
