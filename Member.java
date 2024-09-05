public class Member {
    private int id;
    private String name;
    private String email;

    public Member(int id, String name, String email ){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Member [id=" + id + ", name=" + name + ", email=" + email + "]";
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEMail() {
        return email;
    }
    public void setEMail(String EMail) {
        this.email = EMail;
    }
    
}
