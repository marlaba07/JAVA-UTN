package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Persona {
    private String _id;
    private boolean active;
    private String balance;
    private String eyeColor;
    private String name;
    private String gender;
    private int age;
    private List<String> tags;
    private List<Friend> friends;

    public Persona() {}

    public Persona(String _id, boolean active, String balance, String eyeColor, String name, String gender, List<String> tags, List<Friend> friends, int age) {
        this._id = _id;
        this.active = active;
        this.balance = balance;
        this.eyeColor = eyeColor;
        this.name = name;
        this.gender = gender;
        this.tags = tags;
        this.friends = friends;
        this.age = age;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        active = active;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<Friend> getFriends() {
        return friends;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return age == persona.age &&
                active == persona.active &&
                Objects.equals(_id, persona._id) &&
                Objects.equals(name, persona.name) &&
                Objects.equals(gender, persona.gender) &&
                Objects.equals(eyeColor, persona.eyeColor) &&
                Objects.equals(balance, persona.balance) &&
                Objects.equals(tags, persona.tags) &&
                Objects.equals(friends, persona.friends);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_id, age, name, gender, eyeColor, active, balance, tags, friends);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "_id='" + _id + '\'' +
                ", isActive=" + active +
                ", balance='" + balance + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", tags=" + tags +
                ", friends=" + friends +
                '}';
    }
}
