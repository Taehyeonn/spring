package hello.core;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( //@component 가 붙은 애들을 자동스캔해서 빈에 등록해줌
//        basePackages = "hello.core.member", //탐색 위치 지정. 해당패키지를 포함하여 하위 패키지 모두 ㅏㅁ색
//        지정하지 않았다면 상위패키지부터 탐색함.(여기서는 hello.core)
//        관례상 지정하지 않고 설정 정보클래스 위치를 프로젝트 최상단에 둔다
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class) //등록 예외 지정
)

public class AutoAppConfig {
}
