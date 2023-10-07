<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login Page</title>
    <!-- Thêm Bootstrap CSS vào trang -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/login.css">
</head>

<body>
    <div class="login-content container">
        <div class="back container-fluid">
            <button type="button"><a href="index.html"><svg xmlns="http://www.w3.org/2000/svg" width="10" height="20"
                        viewBox="0 0 23 40" fill="none">
                        <line x1="1.56548" y1="21.3374" x2="20.7337" y2="1.6064" stroke="black" stroke-width="5" />
                        <line x1="1.39361" y1="18.5655" x2="21.1246" y2="37.7337" stroke="black" stroke-width="5" />
                    </svg></a></button>
        </div>
        <div>
            <p style="margin: 0px;">Xin chào bạn!</p>
            <h2><Strong>Đăng nhập để tiếp tục</Strong></h2>
        </div>
        <form class="login-form container" action="login" method="post">
            <p class="text-danger">${mess}</p>
            <div class="form-group">
                <label for="username">Tài khoản:</label>
                <input type="text" class="form-control" name="user">
            </div>
            <div class="form-group">
                <label for="password">Mật khẩu:</label>
                <input type="password" class="form-control" name="pass" id="password">
                <button type="button" id="showPassword">Hiển thị Mật khẩu</button>
            </div>
            <div class="rem-for row">
                <div class="form-check col-6">
                    <input class="form-check-input" id="remme" type="checkbox">
                    <label class="form-check-label" for="remme"><span></span>Remember me
                    </label>
                </div>
                <div class="forgot-pass col-6" style="width: 200px; background-color:#EAF3FF;;">
                    <a href="forgot-password.jsp" class="btn btn-danger">Quên mật khẩu</a>
                    <!-- Liên kết đến trang quên mật khẩu -->
                </div>
            </div>
            <div class="form-row">
                <button type="submit" class="login-button btn btn-primary">Đăng nhập</button>
            </div>

            <!-- Liên kết đến trang đăng ký -->
        </form>

        <hr>
        <!-- Liên kết đăng nhập bằng Google -->
        <form>
            <a href="https://accounts.google.com/o/oauth2/auth?scope=profile&redirect_uri=http://localhost:8080/SHProject/loginGoogleHandler&response_type=code
                   &client_id=167211563617-5l2o9fo4r4lli3ui8nnfsb1c8i1ufniu.apps.googleusercontent.com&approval_prompt=force"
                class="btn btn-danger">Đăng nhập bằng Google</a>
            <a href="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjk1NzMwNjE5LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D"
                class="btn btn-primary">Đăng nhập bằng Facebook</a>
        </form>
        <div class="register-form">
            <p> Chưa là thành viên?</p>
            <a href="register.jsp" class="btn btn-success">Đăng ký </a>
            <p> tại đây</p>
        </div>
        <!-- Liên kết đăng nhập bằng Facebook -->

    </div>

    <!-- Thêm Bootstrap JavaScript và jQuery vào trang (đặt ở cuối trang trước body) -->

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    <script>
        var passwordField = document.getElementById("password");
        var showPasswordButton = document.getElementById("showPassword");
        var rememberMeCheckbox = document.getElementById("rememberMe");
        var isPasswordVisible = false;

        // Kiểm tra cookie và hiển thị mật khẩu nếu được lưu trữ
        if (getCookie("passwordVisible") === "true") {
            passwordField.type = "text";
            showPasswordButton.textContent = "Ẩn Mật khẩu";
            isPasswordVisible = true;
        }

        showPasswordButton.addEventListener("click", function () {
            if (isPasswordVisible) {
                passwordField.type = "password";
                showPasswordButton.textContent = "Hiển thị Mật khẩu";
                isPasswordVisible = false;
            } else {
                passwordField.type = "text";
                showPasswordButton.textContent = "Ẩn Mật khẩu";
                isPasswordVisible = true;
            }
            // Lưu trạng thái hiển thị mật khẩu vào cookie khi người dùng thay đổi
            setCookie("passwordVisible", isPasswordVisible.toString(), 365);
        });

        // Hàm để đặt cookie
        function setCookie(name, value, days) {
            var expires = "";
            if (days) {
                var date = new Date();
                date.setTime(date.getTime() + (days * 24 * 60 * 60 * 1000));
                expires = "; expires=" + date.toUTCString();
            }
            document.cookie = name + "=" + value + expires + "; path=/";
        }

        // Hàm để lấy giá trị của cookie
        function getCookie(name) {
            var nameEQ = name + "=";
            var ca = document.cookie.split(';');
            for (var i = 0; i < ca.length; i++) {
                var c = ca[i];
                while (c.charAt(0) == ' ') {
                    c = c.substring(1, c.length);
                }
                if (c.indexOf(nameEQ) == 0) {
                    return c.substring(nameEQ.length, c.length);
                }
            }
            return null;
        }
    </script>
</body>

</html>
