package com.tuk.sportify.global.config;


import com.tuk.sportify.global.argumentresolver.AuthenticationMemberArgumentResolver;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class HandlerResolverConfig implements WebMvcConfigurer {

    private final AuthenticationMemberArgumentResolver authMemberIdArgumentResolver;

    @Override
    public void addArgumentResolvers(final List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(authMemberIdArgumentResolver);
    }
}