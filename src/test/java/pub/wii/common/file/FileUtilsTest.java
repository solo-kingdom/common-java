package pub.wii.common.file;

import static org.junit.jupiter.api.Assertions.*;

class FileUtilsTest {

    @org.junit.jupiter.api.Test
    void getFileExtension() {
        assertEquals(FileUtils.getFileExtension("index.html"), "html");
        assertEquals(FileUtils.getFileExtension("index"), "");
        assertEquals(FileUtils.getFileExtension(""), "");
        assertEquals(FileUtils.getFileExtension(null), "");
    }
}