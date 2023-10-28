package creationalpatterns.prototype;

public class Game implements Cloneable{

    private int id;
    private String name;
    private DummyMember membership;


    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", membership=" + membership +
                '}';
    }

    public DummyMember getMembership() {
        return membership;
    }

    public void setMembership(DummyMember membership) {
        this.membership = membership;
    }

    @Override
    protected Game clone() throws CloneNotSupportedException {
        Game game = (Game) super.clone();
        game.setMembership(new DummyMember());
        return game;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
