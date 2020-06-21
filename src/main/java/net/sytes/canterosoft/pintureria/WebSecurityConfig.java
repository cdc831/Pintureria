package net.sytes.canterosoft.pintureria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/login","/css/**","/js/**","/img/**","/lib/**","/app/**").permitAll()
                .antMatchers("/index","/home","/").hasAnyRole("USER","ADMIN")
                .antMatchers("/gestionStock","/gestionUsers").hasAnyRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin().permitAll()
                //.formLogin().loginPage("/login")
                .and()
                .logout().permitAll();
    }

    @Autowired
    public void configureSecurityGlobal(AuthenticationManagerBuilder builder) throws Exception {
        builder.jdbcAuthentication()
                .dataSource(dataSource)
                .passwordEncoder(passwordEncoder)
                .usersByUsernameQuery("SELECT username, PASSWORD, status FROM tbl_users WHERE username=?")
                .authoritiesByUsernameQuery("SELECT u.username, r.role from tbl_roles r INNER JOIN tbl_users u ON (r.id_users = u.id_users) WHERE u.username=?");
    }
}
