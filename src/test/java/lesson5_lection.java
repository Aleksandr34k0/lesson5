import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



public class lesson5_lection {

    @BeforeAll
static void before(){
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1580x800";
        Configuration.holdBrowserOpen = true;
    }

@Test
    void test_practice(){

Selenide.open("https://www.otpbank.ru/");
Selenide.$(Selectors.withText("Продолжая просмотр сайта")).shouldBe(Condition.visible);
Selenide.$(Selectors.byTagAndText("strong", "Закрыть")).click();
Selenide.$(Selectors.withText("Продолжая просмотр сайта")).shouldBe(Condition.hidden);

//Selenide.sleep(5000);
    }


    }



