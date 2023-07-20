package UI.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ChoiceOfPaymentPage {

    //Кнопки
    public SelenideElement buttonBuy = $(Selectors.withText("Купить"));
    public SelenideElement buttonBuyCredit = $(Selectors.withText("Купить в кредит"));

    public PaymentWithCardPage selectPaymentByCard() {
        buttonBuy.click();
        return new PaymentWithCardPage();
    }

    public PaymentWithCreditPage selectPaymentByCredit() {
        buttonBuyCredit.click();
        return new PaymentWithCreditPage();
    }
}

