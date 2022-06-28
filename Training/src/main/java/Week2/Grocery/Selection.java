package Week2.Grocery;

public class Selection {

    public void category() {

    String categorySelection = """
     Category: 
        1 - Pantry supplies
        2 - Meat/Poultry/Seafood
        3 - Snacks  
        
     Choose Category(-1 to exit): """;
        System.out.print(categorySelection);
    }

    public void errorMessage() {
        String errorMessage = """
    Invalid Input!
    Please input a proper number from the Selection
    """;
        System.out.print(errorMessage);
    }


}
