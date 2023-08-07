package Variables;

import com.google.j2objc.annotations.Property;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class configProperties {
    public Properties propertiry ;
    public String properityPath ="config.property/config";


    public void Properties (){
        propertiry= new Properties();
        try {
            InputStream File =  Files.newInputStream(Paths.get(properityPath));
            propertiry.load(File);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
