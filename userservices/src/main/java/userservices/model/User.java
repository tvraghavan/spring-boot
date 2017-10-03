package userservices.model;

public class User {
    private String userId;
    private String password;
    private String isActive;
    
    public String getUserId() {
        return this.userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getIsActive() {
        return this.isActive;
    }
    public void setisActive(String isActive) {
        this.isActive = isActive;
    }


}
