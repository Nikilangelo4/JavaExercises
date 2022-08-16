package ch6.entity;

public abstract class AbstractPatient {
    String name;
    String disease;
    String address;
    int age;
    int ID;

    public AbstractPatient(String name, String disease, String address, int age, int ID) {
        this.name = name;
        this.disease = disease;
        this.address = address;
        this.age = age;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "AbstractPatient{"+
        "name='" + name + '\'' + ", disease='" + disease + '\'' + ", address='" + address + '\'' +
        ", age=" + age +
        ", ID=" + ID
        + '}';
    }
}
