# Курсовой проект по модулю «Автоматизация тестирования» для профессии «Инженер по тестированию»

## **CI - status:** ([![Java CI with Gradle](https://github.com/BerryDream7/AqaQamidDiplom/actions/workflows/gradle.yml/badge.svg)](https://github.com/BerryDream7/AqaQamidDiplom/actions/workflows/gradle.yml))

Курсовой проект представляет собой автоматизацию тестирования комплексного сервиса, взаимодействующего с СУБД и API Банка.

## **Инструкция для запуска автотестов**

На вашем ПК должен быть установлени следующий soft:

- IntelliJ IDEA
- Docker desktop (совместно с Docker-compose)
- Chrome браузер

1. Создать git-репозиторий в заранее созданной папке: `git init`

2. Клонировать проект в репозиторий:

`git cline https://github.com/BerryDream7/AqaQamidDiplom`

3. Открыть проект в IntelliJ IDEA

4. Через терминал IDEA запустить контейнер с СУБД при помощи команды: `docker-compose up`

5. Через терминал IDEA запустить веб-сервис при помощи команды: `java -jar artifacts/aqa-shop.jar`

6. Проверить, что приложение успешно запустилось: для этого в Сhrome браузере введите следующий URL: http://localhost:8080

7. Запустить автотесты через терминал IDEA при помощи команды: `gradlew clean test`

8. Проверить отправку данных карты на виртуальный платежный сервер можно по URL: http://185.119.57.197:9998/container/af5c95638cc2

## **Требования/документация**

`https://github.com/netology-code/aqa-qamid-diplom/blob/main/README.md`

## **План тестирования веб-сервиса покупки тура**

`https://github.com/BerryDream7/AqaQamidDiplom/blob/main/Plan.md`

## **Баг - репорты**

1. `https://github.com/BerryDream7/AqaQamidDiplom/issues/1`
2. `https://github.com/BerryDream7/AqaQamidDiplom/issues/2`
3. `https://github.com/BerryDream7/AqaQamidDiplom/issues/3`
4. `https://github.com/BerryDream7/AqaQamidDiplom/issues/4`

## **Отчёт о проведённом тестировании веб-сервиса**

`https://github.com/BerryDream7/AqaQamidDiplom/blob/main/Report.md`

## **Отчёт о проведённой автоматизации веб - сервиса**

`https://github.com/BerryDream7/AqaQamidDiplom/blob/main/Summary.md`