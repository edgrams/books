package Chapter6;

import org.apache.hadoop.io.Text;

/**
 * Created by edgrams on 1/6/17.
 */
public class NcdcRecordParser {
    private static final int MALFORMED_TEMPERATURE = 1000;
    private static final int MISSING_TEMPERATURE = 9999;

    private String stationId;
    private String year;
    private int airTemperature;
    private String quality;

    public void parse(String record) {
        stationId = record.substring(4, 10) + "-" + record.substring(10, 15);
        year = record.substring(15, 19);
        String airTemperatureString;

        if (record.charAt(87) == '+') {
            airTemperatureString = record.substring(88, 92);
        } else {
            airTemperatureString = record.substring(87, 92);
        }
        airTemperature = Integer.parseInt(airTemperatureString);
        quality = record.substring(92, 93);
    }

    public void parse(Text record) {
        parse(record.toString());
    }

    public boolean isMalformedTemperature() { return airTemperature > MALFORMED_TEMPERATURE; }

    public boolean isMissingTemperature() { return airTemperature == MISSING_TEMPERATURE; }

    public boolean isValidTemperature() {
        return airTemperature < MALFORMED_TEMPERATURE &&
                airTemperature != MISSING_TEMPERATURE &&
                quality.matches("[01459]");
    }

    public String getStationId() {
        return stationId;
    }

    public String getQuality() {
        return quality;
    }

    public String getYear() {
        return year;
    }

    public int getAirTemperature() {
        return airTemperature;
    }

    public int getYearInt() { return Integer.parseInt(year); }
}
