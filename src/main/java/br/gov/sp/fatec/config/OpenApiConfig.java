package br.gov.sp.fatec.config;

import static br.gov.sp.fatec.constants.OpenApiConfigConstants.*;
import static java.util.stream.Stream.of;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info =
                @Info(
                        title = OPENAPI_INFO_TITLE,
                        version = OPENAPI_INFO_VERSION,
                        description = OPENAPI_INFO_DESCRIPTION))
@Configuration
public class OpenApiConfig {

    @Value(value = "${openapi-servers-urls}")
    private String[] openApiServersUrls;

    @Bean
    public OpenAPI customOpenAPI() {
        OpenAPI openApi = new OpenAPI();
        of(openApiServersUrls).forEach(url -> openApi.addServersItem(new Server().url(url)));
        return openApi;
    }
}
