package guru.springframework.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class Notes extends AbstractEntity {

    @OneToOne
    private Recipe recipe;

    @Lob // LargeObject - signifies that the annotated field should be represented as BLOB (binary data) in the DataBase
    private String recipeNotes;

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
