public class User {
  private String username;
  private boolean activated;
  
  public String isActivated() {
    return activated ? "ACTIVE" : "INACTIVE"; 
  }
}
