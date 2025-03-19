package farmix.com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
//        http.sessionManagement(management -> management.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//                .authorizeHttpRequests(authorize ->
//                authorize.requestMatchers("/api/auth/**").permitAll()
//                        .requestMatchers("/api/admin/**").hasAnyRole("ADMIN","INSTRUCTOR")
//                        .requestMatchers("/api/**").authenticated().anyRequest().permitAll()
//                        ).addFilterBefore(new JwtTokenValidator())
//      http.csrf().disable()
//              .authorizeHttpRequests()
//              .requestMatchers("/api/auth/**").permitAll()
//              .requestMatchers("/api/admin/**").hasRole("ADMIN")
//              .requestMatchers("/api/instructor/**").hasRole("INSTRUCTOR")
//              .requestMatchers("/api/student/**").hasRole("STUDENT")
//              .anyRequest().authenticated()
//              .and()
//              .httpBasic();
        return null;
    }

}
