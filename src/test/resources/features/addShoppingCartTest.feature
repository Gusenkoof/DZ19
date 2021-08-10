#language:ru
#encoding:UTF-8

@shopping
Функционал: Проверка добавленеия товара в карзину

  Сценарий: Проверка, что товар на который мы нажали попадает в корзину
    Допустим открыта страница "https://www.saucedemo.com/"
    И введен логин "standard_user"
    И введен пароль "secret_sauce"
    И нажата кнопка авторизации
    Тогда  переходим на страницу "https://www.saucedemo.com/inventory.html"
    И нажата кнопка добавления первого товара в корзину
    И нажата кнопка перехода в корзину
    Тогда добавленный товар окажется в корзине


