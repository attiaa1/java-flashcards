import java.time.LocalDateTime;

public class Deck {
  private String name;  
  private List<Flashcard> flashcards;

  public Deck(String name, List<Flashcard> flashcards){
    String defaultName = "Deck_" + LocalDateTime.now().toLocalDate();

    this.name = (name != null) ? name : defaultName;  
    this.flashcards = (flashcards != null) ? flashcards : new ArrayList<>();
  }

  public String getName(){ 
    return name;
  }
  
  public List<Flashcard> getFlashcards(){
    return flashcards;
  }

  public Flashcard getFlashcard(int index){
    if (index < 0 || index >= flashcards.size()) {
      System.out.println("Flashcard selected out of bounds.");
      return new Flashcard("Prompt not available.", "Answer not available.") 
    }
    else {
      return flashcards.get(index);
    } 
  }

  public void addFlashcard(Flashcard flashcard){
    flashcards.add(flashcard);
  }

  public void deleteFlashcard(int index){
    if (index >= 0 && index < flashcards.size){
      flashcards.remove(index);
    }
    else {
      System.out.println("Flashcard does not exist, cannot remove.");
    }
  }

  public void replaceFlashcard(int index, Flashcard newFlashcard) {
    if (index >= 0 && index < flashcards.size()) {
        flashcards.set(index, newFlashcard);
    } else {
        System.out.println("Invalid index. Cannot replace flashcard.");
    }
  }

  public boolean doesFlashcardExist(Flashcard flashcard){
    if (flashcards.contains(flashcard) {
      return true;
    }
    else {
      return false;
    }
  }

  public void shuffleDeck(){
    Collections.shuffle(flashcards);
  }

  public void removeAllFlashcards(){
    flashcards.clear();
  }

  public int amountOfFlashcards(){
    return flashcards.size();
  }

}
