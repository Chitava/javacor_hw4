package buyers;

public class Buyer {
    private String name;
    private int age;
    private int phone;

    public Buyer(String name, int age, int phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String firstname) {
        this.name = firstname;
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

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("Покупатель ");
        info.append(getName() +  "\n");
        info.append("Возраст ");
        info.append(getAge() + "\n");
        info.append("Номер телефона - ");
        info.append(getPhone() + "\n");
        return info.toString();
    }
}
