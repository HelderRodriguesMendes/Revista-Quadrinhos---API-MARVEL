package helderrodrigues.desafiomobicare.revistaquadrinhos.api.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CharacterDataContainer{
    private int offset;
    private int limit;
    private int total;
    private int count;
    private List<Character> results = new ArrayList<>();

    public int getOffset() {
        return offset;
    }

    public int getLimit() {
        return limit;
    }

    public int getTotal() {
        return total;
    }

    public int getCount() {
        return count;
    }

    public List<Character> getResults() {
        return results;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setResults(List<Character> results) {
        this.results = results;
    }
}
