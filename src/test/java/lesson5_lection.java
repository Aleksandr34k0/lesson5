import com.codeborne.selenide.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


public class lesson5_lection {

    @BeforeAll
static void before(){
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1580x800";
        Configuration.holdBrowserOpen = true;
    }

@Test
    void test_practice(){

open("https://www.otpbank.ru/");
$(Selectors.withText("Продолжая просмотр сайта")).shouldBe(Condition.visible);
$(Selectors.byTagAndText("strong", "Закрыть")).click();
$(Selectors.withText("Продолжая просмотр сайта")).shouldBe(Condition.hidden);


//Selenide.sleep(5000);
    }


    }



