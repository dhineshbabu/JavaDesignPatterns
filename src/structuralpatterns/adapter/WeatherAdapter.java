package structuralpatterns.adapter;

public class WeatherAdapter {
    public int findTemp(int zipCode) {
        String city = null;
        if(zipCode==19406) {
            city= "king of Prussia";
        }
        WeatherFinder finder = new WeatherFinderImpl();
        return finder.find(city);
    }
}
