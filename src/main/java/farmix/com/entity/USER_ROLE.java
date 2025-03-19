package farmix.com.entity;

import lombok.Getter;

@Getter
public enum USER_ROLE {
    ADMIN("ROLE_ADMIN"),
    INSTRUCTOR("ROLE_INSTRUCTOR"),
    STUDENT("ROLE_STUDENT");

    private final String authority;

    USER_ROLE(String authority) {
        this.authority = authority;
    }

}
