package behavioralpatterns.observer;

public class Test {
    public static void main(String[] args) {
        NewsChannel bbc = new NewsChannel();
        NewsChannel cnbc = new NewsChannel();

        NewsAgency common = new NewsAgency();

        common.addObserver(bbc);
        common.addObserver(cnbc);

        common.setNews("News 1");

        System.out.println(bbc.getNews());
        System.out.println(cnbc.getNews());

        common.setNews("News 2");

        System.out.println(bbc.getNews());
        System.out.println(cnbc.getNews());
    }
}
