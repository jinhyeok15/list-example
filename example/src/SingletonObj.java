public class SingletonObj {
    private int index;
    private String name;
    private String grade;

    private SingletonObj() {}

    private static class LazyHolder {
        public static final SingletonObj INSTANCE = new SingletonObj();
    }

    public static SingletonObj getInstance() {
        return LazyHolder.INSTANCE;
    }

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
