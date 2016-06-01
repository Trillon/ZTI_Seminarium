package proj4;

import org.springframework.security.core.GrantedAuthority;

class Role implements GrantedAuthority {

    private String authority;

    Role(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
