<!DOCTYPE html>
<html>
<head>
    <title>AVITOS</title>
</head>
<body>
<h1>AVITOS</h1>
<hr>
<h4>Товары со всей России</h4>
<#list products as product>
    <div>
        <p>
            <b>${product.title}</b> | <a href="/product/${product.id}">Подробнее... </a> <br>
            Стоимость: ${product.price} руб.
    </div>
</#list>
<hr>
<h3>Создать новый товар</h3>
<form action="/product/create" method="post">
    Название объявления: <input type="text" name="title"/><br><br>
    Описание объявления: <input type="text" name="description"/><br><br>
    Цена: <input type="number" name="price"/><br><br>
    Город: <input type="text" name="city"/><br><br>
    Имя автора: <input type="text" name="author"/><br><br>
    <input type="submit" value="Добавить товар"/>
</form>
</body>
</html>