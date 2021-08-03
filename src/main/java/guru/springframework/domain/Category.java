package guru.springframework.domain;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

@Entity
public class Category extends AbstractEntity {

    private String description;

    private Set<Recipe> recipes;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        if (this.recipes == null) {
            this.recipes = new HashSet<>();
        }
        this.recipes.addAll(recipes);
    }
}
