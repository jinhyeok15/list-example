public class SingletonObj extends SampleObj {

    private SingletonObj() {}

    private static class LazyHolder {
        public static final SingletonObj INSTANCE = new SingletonObj();
    }

    public static SingletonObj getInstance() {
        return LazyHolder.INSTANCE;
    }
}
