package helderrodrigues.desafiomobicare.revistaquadrinhos.api.model;

import java.util.List;

public class Character {
    private int id;
    private String name;
    private String descripton;
    private String modified;
    private Thumbnail thumbnail;
    private String resourceURI;
    private Comics comics;
    private Series series;
    private Stories stories;
    private Events events;
    private List<Urls> urls;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescripton() {
        return descripton;
    }

    public String getModified() {
        return modified;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public Comics getComics() {
        return comics;
    }

    public Series getSeries() {
        return series;
    }

    public Stories getStories() {
        return stories;
    }

    public Events getEvents() {
        return events;
    }

    public List<Urls> getUrls() {
        return urls;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public void setComics(Comics comics) {
        this.comics = comics;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public void setStories(Stories stories) {
        this.stories = stories;
    }

    public void setEvents(Events events) {
        this.events = events;
    }

    public void setUrls(List<Urls> urls) {
        this.urls = urls;
    }
}
