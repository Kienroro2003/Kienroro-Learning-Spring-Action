package tacos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
//@AllArgsConstructor
//@Getter
//@Setter
public class Ingredient {

  private final String id;
  private  final String name;
  private final Type type;
  
  public enum Type {
    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
  }

  public Ingredient(String id, String name, Type type) {
	  this.id = id;
	  this.name = name;
	  this.type = type;
  }
}
