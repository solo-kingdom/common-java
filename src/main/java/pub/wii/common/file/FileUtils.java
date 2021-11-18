package pub.wii.common.file;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import java.io.File;
import java.util.Optional;

public class FileUtils {
    public static Optional<String> getFileExtension(String name) {
        if (StringUtils.isBlank(name)) {
            return Optional.empty();
        }

        int idx = name.lastIndexOf(".");
        return idx > 0 ? Optional.of(name.substring(idx + 1)) : Optional.empty();
    }

    public static void ensurePath(String path) {
        File dir = new File(path);
        if (!dir.exists()) {
            Validate.isTrue(dir.mkdirs(), "create directory failed");
        }
    }
}
