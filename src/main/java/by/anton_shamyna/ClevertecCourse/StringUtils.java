package by.anton_shamyna.ClevertecCourse;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null || str.isEmpty())
            return false;
        try {
            var val = Double.parseDouble(str);
            if (val > 0)
                return true;
            else
                return false;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}