package behavioralpatterns.templatemethod;

import javax.xml.crypto.Data;

public class Test {
    public static void main(String[] args) {
        DataRenderer xmlrenderer = new XMLDataRenderer();
        String data = xmlrenderer.readData();
        System.out.println(xmlrenderer.processData(data));

        DataRenderer csvrenderer = new CSVDataRenderer();
        String dataCsv = csvrenderer.readData();
        System.out.println(csvrenderer.processData(dataCsv));
    }
}
