package helderrodrigues.desafiomobicare.revistaquadrinhos.api.model;

import java.io.Serializable;
import java.util.List;

public class Comics {
    private int available;
    private String collectionURI;
    private List<Items> items;
    private int returned;

    public int getAvailable() {
        return available;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public List<Items> getItems() {
        return items;
    }

    public int getReturned() {
        return returned;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public void setReturned(int returned) {
        this.returned = returned;
    }
}
