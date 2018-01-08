package guru.springframework.domain;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * Created by thebloez on 08/01/18.
 */
@Entity
public class UnitOfMeasure {

    private String uom;

    @OneToOne
    private Ingredient ingredient;

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }
}
