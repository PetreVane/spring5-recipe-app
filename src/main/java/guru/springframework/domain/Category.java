package guru.springframework.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

@Entity
public class Category extends AbstractEntity {

    private String description;

    // points to 'categories' field inside the Recipe entity
    @ManyToMany(mappedBy = "categories")
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
