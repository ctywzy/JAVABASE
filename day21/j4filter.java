package day21;

import java.io.File;
import java.io.FilenameFilter;

public class j4filter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".sys");
    }
}
