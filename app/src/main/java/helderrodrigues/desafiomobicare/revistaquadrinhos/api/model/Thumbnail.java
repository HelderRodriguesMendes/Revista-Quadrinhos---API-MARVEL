package helderrodrigues.desafiomobicare.revistaquadrinhos.api.model;

import java.io.Serializable;

public class Thumbnail {
    private String path;
    private String extension;

    public String getPath() {
        return path;
    }

    public String getExtension() {
        return extension;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}
