package structuralpatterns.adapter;

public class WeatherUI {
    public void showTemp(int zipcode) {
       WeatherAdapter adapter = new WeatherAdapter();
        System.out.println(adapter.findTemp(zipcode));
    }

    public static void main(String[] args) {
        WeatherUI ui = new WeatherUI();
        ui.showTemp(19406);
    }
}
