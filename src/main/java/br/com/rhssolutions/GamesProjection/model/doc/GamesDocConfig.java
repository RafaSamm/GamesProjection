package br.com.rhssolutions.GamesProjection.model.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SuppressWarnings("all")
public class GamesDocConfig {

    private Contact contact(){
        return new Contact()
                .name("RHSsolutions")
                .email("rhssolutions@gmail.com")
                .url("https://rhssolutions.com.br");
    }
    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("Games Projection")
                        .version("1.0.0")
                        .description("API for projection of games")
                        .termsOfService("https://rhssoultions.com.br")
                        .contact(contact()));
    }





}
