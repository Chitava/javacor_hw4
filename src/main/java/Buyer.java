public class Buyer {
    private String firstname;
    private String secondname;
    private String patronymic;
    private int age;
    private int phone;

    public Buyer(String firstname, String secondname, String patronymic, int age, int phone) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.patronymic = patronymic;
        this.age = age;
        this.phone = phone;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
