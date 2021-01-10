import java.nio.file.Paths;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
 
public class RecipeSearch {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        
        try (Scanner textScan = new Scanner(Paths.get(fileName))) {
            ArrayList<Recipe> recipes = new ArrayList<>();
            System.out.println();
            // Adding the recipe goes here
            // Variables to hold the recipe's name, time it takes to cook, and
            // a list of the ingredients. Will be using these to instantiate a 
            // Recipe object.
            String recipeName = "";
            int timeToCook = 0;
            ArrayList<String> ingredients = new ArrayList<>();
 
            // Keep track where we are reading in the file. 
            // If 0, that means we're reading the name of the recipe.
            // If 1, that means we're reading the time it takes to cook.
            // Any other number, that means we're reading the ingredients/new line.
            int lineNumber = 0;
 
            while (textScan.hasNextLine()) {
                String line = textScan.nextLine();
                if (line.isEmpty()) {
                    // If it goes here, that means we're done reading the current
                    // ingredient. So make a new Recipes object.
                    recipes.add(new Recipe(recipeName, timeToCook, ingredients));
                    // Reset lineNumber to 0 and clear ingredients.
                    lineNumber = 0;
                    ingredients = new ArrayList<>();
                } else {
                    if (lineNumber == 0) {
                        // Reading name of the recipe.
 
                        recipeName = line;
                        lineNumber++;
                    } else if (lineNumber == 1) {
                        // Reading the time it takes to cook the recipe.
 
                        timeToCook = Integer.valueOf(line);
                        lineNumber++;
                    } else {
                        // Reading the ingredients of the recipe.
 
                        ingredients.add(line);
                    }
                }
            }
            // End of file is reached, but still need to make new Recipe object for
            // final recipe.
            recipes.add(new Recipe(recipeName, timeToCook, ingredients));
            //
 
            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            System.out.println();
 
            while (true) {
                System.out.print("Enter command: ");
                String command = scanner.nextLine();
 
                if (command.equals("list")) {
                    list(recipes);
                } else if (command.equals("stop")) {
                    break;
                } else if (command.equals("find name")) {
                    System.out.print("Searched word: ");
                    String searchedWord = scanner.nextLine();
                    findName(searchedWord, recipes);
                } else if (command.equals("find cooking time")) {
                    System.out.print("Max cooking time: ");
                    int maxCookTime = Integer.valueOf(scanner.nextLine());
                    findCookingTime(maxCookTime, recipes);
                } else if (command.equals("find ingredient")) {
                    System.out.print("Ingredient: ");
                    String ingredient = scanner.nextLine();
                    findIngredient(ingredient, recipes);
                }
            }
        } catch (Exception e) {
            // Do nothing.
        }
    }
    
    public static void list(ArrayList<Recipe> recipes) {
        System.out.println();
        System.out.println("Recipes:");
        for (Recipe recipe: recipes) {
            System.out.println(recipe);
        }
        System.out.println();
    }
    
    public static void findName(String searchedWord, ArrayList<Recipe> recipes) {
//        System.out.print("Searched word: ");
//        String searchedWord = scanner.nextLine();
        System.out.println();
        System.out.println("Recipes:");
        for (Recipe recipe: recipes) {
            if (recipe.getName().contains(searchedWord)) {
                System.out.println(recipe);
            }
        }
        System.out.println();
    }
    
    public static void findCookingTime(int maxCookTime, ArrayList<Recipe> recipes) {
//        System.out.print("Max cooking time: ");
//        int maxCookTime = Integer.valueOf(scanner.nextLine());
        System.out.println();
        System.out.println("Recipes:");
        for (Recipe recipe: recipes) {
            if (recipe.getTime() <= maxCookTime) {
                System.out.println(recipe);
            }
        }
        System.out.println();
    }
    
    public static void findIngredient(String ingredient, ArrayList<Recipe> recipes) {
//        System.out.print("Ingredient: ");
//        String ingredient = scanner.nextLine();
        System.out.println();
        System.out.println("Recipes:");
        for (Recipe recipe: recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
        System.out.println();
    }
 
}
 