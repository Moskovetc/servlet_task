<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Магазин всякая всячина</title>
    <link href="style.css" rel="stylesheet">
</head>

<body style onload="appendProducts(); setDiscount(); setUserName();">
    <div class="fixed-position">
        <div class="navigation-row-container">
            <div class="nav-left">
                <div class="username-block">
                    User Name
                </div>
                <div class="login-button-block">
                    <div class="login-button" onclick="signup()">
                        Logout
                    </div>
                </div>
            </div>
            <div class="nav-right">
                <div class="search-bar-block" id="search-button" onclick="showModal('search-modal');showProducts();">
                    <div class="search-bar-button">
                        Search...
                    </div>
                </div>
                <div class="basket-block" onclick="showModal('basket-modal'); showDescriptionInBasket();">
                    <div id="basket-button">
                        0
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="category">
        <div class="category-title-block">
            <h2 class="category-title">Smartphones</h2>
            <hr class="category-hr">
        </div>
        <div class="products-container" id="smtphns">
        </div>
    </div>
    <div class="category">
        <div class="category-title-block">
            <h2 class="category-title">Headphones</h2>
            <hr class="category-hr">
        </div>
        <div class="products-container" id="hdphns">
        </div>
    </div>
    <div id="basket-modal" class="modal">
        <div class="basket-content-container">
            <div class="modal-content">
                <span class="close">&times;</span>
                <h2 class="popup-title">Корзина</h2>
                <hr class="popup-hr">
                <div class="products-list-basket">

                </div>
                <div class="sum-container">
                    <div class="sum">
                        <div class="text-sum">
                            Сумма товаров
                        </div>
                        <div class="count-sum">
                            12312
                        </div>
                    </div>
                    <div class="skidka">
                        <div class="text-skidka">
                            Скидка
                        </div>
                        <div class="count-skidka">
                            10%
                        </div>
                        <div class="sum-skidka">
                            12312
                        </div>
                    </div>
                    <div class="final">
                        <div class="text-final">
                            Итого
                        </div>
                        <div class="count-final">
                            12312
                        </div>
                        <div class="submit-button" onclick="submitButton()">
                            Оформить
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div id="search-modal" class="modal">
        <div class="modal-content">
            <span class="close">&times;</span>
            <h2 class="popup-title">Поиск</h2>
            <div id="search-placeholder">
                <input type=search id="myInput" placeholder="Введите текст для поиска" onkeyup="filterProducts()">
                <hr class="popup-hr">
            </div>
            <div class="products-list-search">

            </div>
        </div>
    </div>
    <footer>
        <div class="footer-container">
            <hr class="footer-hr">
            <span class="footer-text">Текстовая информация для футера</span>
            <span class="produced-by">Student production</span>
        </div>
    </footer>
    <script src="scripts/jquery-3.3.1.min.js"></script>
    <script src="scripts/product.js"></script>
    <script src="scripts/modalWindow.js"></script>
    <script src="scripts/basket.js"></script>
    <script src="scripts/search.js"></script>
    <script src="scripts/discount.js"></script>
    <script src="scripts/submit.js"></script>
    <script src="scripts/signup.js"></script>
    <script src="scripts/navbar.js"></script>
</body>

</html>