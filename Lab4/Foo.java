public final class Foo {
    private static class FooLoader {
        private static final Foo INSTANCE = new Foo();
    }
    private Foo() {
        if (FooLoader.INSTANCE != null) {
            throw new IllegalStateException("Already instantiated");
        }
    }
    public static Foo getInstance() {
        return FooLoader.INSTANCE;
    }
}