package MerkMobil.API.security;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import org.springframework.security.core.userdetails.User;
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/auth/register", "/api/auth/login").permitAll()
                .anyRequest().authenticated()
            )
            .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .addFilterBefore(new JwtAuthenticationFilter(userDetailsService()), org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter.class); // Tambahkan ini

        return http.build();
    }


    @Bean
    public UserDetailsService userDetailsService() {
        // Hapus default user bawaan Spring Security
        UserDetails user = User.withUsername("admin")
                .password("{noop}admin123")
                .build();
        return new InMemoryUserDetailsManager(user);
    }
}