package com.example.demo.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-31T23:19:03.508835-07:00[America/Los_Angeles]")

@Controller
@RequestMapping("${openapi..base-path:/v2}")
public class CityApiController implements CityApi {

    private final CityApiDelegate delegate;

    public CityApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) CityApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new CityApiDelegate() {});
    }

    @Override
    public CityApiDelegate getDelegate() {
        return delegate;
    }

}
