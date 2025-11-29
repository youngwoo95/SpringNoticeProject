import lombok.AllArgsConstructor;
import lombok.Data;

// Lombok으로 대체
//@Data
//@AllArgsConstructor
public class Member {
    private Long id;
    private String name;
    private String email;
    private Integer age;


    public Member(Long id, String name, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
