public class User {
    public String name;
    public String status;
    public User(String line){
        String[] parts = line.split(",");
        this.name = parts[0];
        this.status = parts[1];
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
