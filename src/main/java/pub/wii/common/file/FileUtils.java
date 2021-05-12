package pub.wii.common.file;

public class FileUtils {
    public static String getFileExtension(String name) {
        if (name == null || name.length() == 0) {
            return "";
        }

        int idx = name.lastIndexOf(".");
        if (idx > 0) {
            return name.substring(idx+1);
        } else {
            return "";
        }
    }
}
