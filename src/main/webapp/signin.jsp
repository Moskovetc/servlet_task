<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Регистрация</title>
    <link href="signin.css" rel="stylesheet">
</head>

<body style>
    <div class="signup-content">
        <div class="signup-title-block">
            <h2 class="signup-title">Авторизация</h2>
            <hr class="signup-hr">
        </div>
        <div class="signup-container">
            <input type=search class="placeholder" id="login" placeholder="Логин" onkeyup="tape('login')">
            <input type=search class="placeholder" id="pass" placeholder="Пароль" onkeyup="tape('pass')">
            <div class="alert-info">

            </div>
            <div class="signup-button" onclick="validation(false);">
                <div class="highlight">
                    Вход
                </div>
            </div>
            <div class="info">
                <p><a class="ex1" href="signin.html">Зарегистрироваться</a></p>
            </div>
        </div>
    </div>
    <script src="scripts/signup.js"></script>
</body>

</html>