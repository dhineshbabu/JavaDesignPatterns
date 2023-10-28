package creationalpatterns.abstractfactory;

public abstract class DaoAbstractFactory {
    public abstract Dao createDao(String type);
}
