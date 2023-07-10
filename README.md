# Курсовой проект по модулю «Автоматизация тестирования» для профессии «Инженер по тестированию»

## **CI - status:** ()

Курсовой проект представляет собой автоматизацию тестирования комплексного сервиса, взаимодействующего с СУБД и API Банка.

## **Инструкция для запуска автотестов**

На вашем ПК должен быть установлени следующий soft:

- IntelliJ IDEA
- Docker desktop (совместно с Docker-compose)
- Chrome браузер

1. Создать git-репозиторий в заранее созданной папке: `git init`

2. Клонировать проект в репозиторий:

`git cline https://`

3. Открыть проект в IntelliJ IDEA

4. Через терминал IDEA запустить контейнер с СУБД при помощи команды: `docker-compose up`

5. Через терминал IDEA запустить веб-сервис при помощи команды: `java -jar artifacts/aqa-shop.jar`

6. Проверить, что приложение успешно запустилось: для этого в Сhrome браузере введите следующий URL: http://localhost:8080

7. Запустить автотесты через терминал IDEA при помощи команды: `gradlew clean test`

8. Проверить отправку данных карты на виртуальный платежный сервер можно по URL: http://185.119.57.197:9998/container/af5c95638cc2

## **Требования/документация**

https://github.com/netology-code/aqa-qamid-diplom/blob/main/README.md

## **План тестирования веб-сервиса покупки тура**



## **Баг - репорты**



## **Отчёт о проведённом тестировании веб-сервиса**



## **Отчёт о проведённой автоматизации веб - сервиса**
