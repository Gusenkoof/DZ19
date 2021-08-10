#language:ru
#encoding:UTF-8

@login
Функционал: Параметризированный запуск тестов

  Структура сценария: Проверка входа на страницу под разными логином <userName>
    Допустим открыта страница "https://www.saucedemo.com/"
    И введен логин "<userName>"
    И введен пароль "<password>"
    И нажата кнопка авторизации
    Тогда  на странице появляется надпись "PRODUCTS"

    Примеры:
      | userName                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |