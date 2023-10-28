package creationalpatterns.singleton;

public class TestEnumSingleton {
    public static void main(String[] args) {
        EnumSingletonDemo instance = EnumSingletonDemo.INSTANCE;
        System.out.println(instance.getName());
        instance.setName("kani");
        System.out.println(instance.getName());
    }
}
