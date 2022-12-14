package calculate.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public final class MeterReadingsUtil {
    public static final Double HOT_WATER_COEFFICIENT = 206.16;
    public static final Double COLD_WATER_COEFFICIENT = 59.93;
    public static final Double ELECTRICITY_COEFFICIENT = 2.58;

    public static String getPreviousCounterValue(String link) {
        String string = null;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(link))) {
            String str = bufferedReader.readLine();
            if (str != null) {
                string = str;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return string;
    }

    public static void overwriting(String link, Double value) {
        try(FileWriter fileWriter = new FileWriter(link)) {
            fileWriter.write(String.valueOf(value));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
