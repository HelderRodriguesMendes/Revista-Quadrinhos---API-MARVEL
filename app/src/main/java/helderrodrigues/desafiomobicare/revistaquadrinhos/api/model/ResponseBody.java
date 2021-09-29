package helderrodrigues.desafiomobicare.revistaquadrinhos.api.model;

import java.io.Serializable;

public class ResponseBody {
    private CharacterDataWrapper characterDataWrapper;

    public CharacterDataWrapper getCharacterDataWrapper() {
        return characterDataWrapper;
    }

    public void setCharacterDataWrapper(CharacterDataWrapper characterDataWrapper) {
        this.characterDataWrapper = characterDataWrapper;
    }
}
