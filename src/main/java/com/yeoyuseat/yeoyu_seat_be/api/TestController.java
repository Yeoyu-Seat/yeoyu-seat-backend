package com.yeoyuseat.yeoyu_seat_be.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping
    public String test() {
        String imageUrl = "https://i.pinimg.com/736x/72/cd/f4/72cdf4e04fa2679aa14cbb8784c9b5c3.jpg";
        return "Hello, YeoyuItNyang! <br> 여기까지 보인다면 아래의 내용들 완료된 상태<br>1. EC2 배포<br>2. ubuntu 백그라운드 실행<br>3. Nginx 설치 및 리버스 프록시 설정<br>4. DNS<br>5. 도메인 연결<br>6. HTTPS SSL 인증 적용<br>7. Docker 적용<br>8. GitHub Actions 적용(CI/CD)<br>9. AWS RDS 연동<br><br>" +
                "<img src=\"" + imageUrl + "\" alt=\"Test Image\" style=\"max-width:100%; height:auto;\">";
    }
}
