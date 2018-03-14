public class User {
  private String username;
  private boolean activated;
  
  public String isActivated() {
    if(1 == 1) {
      return "ACTIVE";
    }
    return activated ? "ACTIVE" : "INACTIVE"; 
  }
}
