package com.tuk.sportify.global.response;

import jakarta.servlet.http.HttpServletResponse;

import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@RestControllerAdvice
public class GlobalResponseBodyAdvice implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(
            final MethodParameter returnType,
            final Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(
            final Object body,
            final MethodParameter returnType,
            final MediaType selectedContentType,
            final Class<? extends HttpMessageConverter<?>> selectedConverterType,
            final ServerHttpRequest request,
            final ServerHttpResponse response) {
        if (body instanceof ErrorResponse) {
            return body;
        }
        HttpServletResponse servletResponse =
                ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                        .getResponse();
        int status = servletResponse.getStatus();
        String reasonPhrase = HttpStatus.resolve(status).getReasonPhrase();
        return SuccessResponse.builder()
                .data(body)
                .httpStatusCode(status)
                .httpStatusMessage(reasonPhrase)
                .build();
    }
}
