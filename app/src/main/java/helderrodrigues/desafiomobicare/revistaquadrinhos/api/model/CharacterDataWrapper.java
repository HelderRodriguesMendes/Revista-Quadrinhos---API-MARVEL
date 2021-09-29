package helderrodrigues.desafiomobicare.revistaquadrinhos.api.model;

import java.io.Serializable;

public class CharacterDataWrapper implements Serializable{
    private int code;
    private String status;
    private String copyright ;
    private String attributionText;
    private String attributionHTML;
    private String etag;
    private CharacterDataContainer data;

    public int getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getAttributionText() {
        return attributionText;
    }

    public String getAttributionHTML() {
        return attributionHTML;
    }

    public String getEtag() {
        return etag;
    }

    public CharacterDataContainer getData() {
        return data;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public void setAttributionText(String attributionText) {
        this.attributionText = attributionText;
    }

    public void setAttributionHTML(String attributionHTML) {
        this.attributionHTML = attributionHTML;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public void setData(CharacterDataContainer data) {
        this.data = data;
    }
}
