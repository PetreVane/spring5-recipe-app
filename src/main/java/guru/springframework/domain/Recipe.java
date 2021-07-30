package guru.springframework.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

@Data
@Entity
public class Recipe extends AbstractEntity {

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;

    // LargeObject - signifies that the annotated field should be represented as BLOB (binary data) in the DataBase
    @Lob
    private Byte[] image;

    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;

    // mappedBy = "recipe" points to 'recipe' field within Ingredient
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "recipe")
    private Set<Ingredient> ingredients;

    public void addIngredient(Ingredient ingredient) {
        if (ingredients == null) {
            ingredients = new HashSet<>();
        }
        ingredients.add(ingredient);
    }

}
