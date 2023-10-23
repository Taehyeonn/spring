package hello.core;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( //@compnentㄱㅏ 붙은 애들을 자동스캔해서 빈에 등록해줌
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class) //등록 예외 지정
)

public class AutoAppConfig {
}
