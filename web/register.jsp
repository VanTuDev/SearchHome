
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Registration</title>
        <!-- Link to Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/register.css">
    </head>
    <body>
        <div class="register-content container mt-5">
            <div class="row justify-content-center">
                <div class="col-md-6">
                    <div class="card">
                        <div class="card-header">
                            <p>Xin chào bạn!</p>
                            <h2 class="text-center">Đăng ký tài khoản mới</h2>
                        </div>
                        <div class="card-body">
                            <form class="register-form" action="signup" method="POST" onsubmit="return validateForm()">
                                <div class="form-group">
                                    <label for="username">UserName:</label>
                                    <input type="text" class="form-control"  name="user" required>
                                </div>
                                
                                <div class="form-group">
                                    <label for="fullname">FullName:</label>
                                    <input type="text" class="form-control"  name="fullname" required>
                                </div>
                                
                                <div class="form-group">
                                    <label for="gender">Gender:</label>
                                    <select class="form-control" name="gender" required>
                                        <option value="male">Nam</option>
                                        <option value="female">Nữ</option>
                                        <option value="other">Other</option>
                                    </select>
                                </div>

                                <div class="form-group">
                                    <label for="gmail">Gmail:</label>
                                    <input type="email" class="form-control"  name="gmail" required>
                                </div>

                                <div class="form-group">
                                    <label for="password">Password:</label>
                                    <input type="password" class="form-control"  name="pass" required>
                                    <small id="passwordMatchError" class="text-danger d-none">Enter minimum 8 character.</small>
                                </div>

                                <div class="form-group">
                                    <label for="repass">Confirm Password:</label>
                                    <input type="password" class="form-control"  name="repass" required>
                                    <small id="passwordMatchError" class="text-danger d-none">Passwords do not match.</small>
                                </div>

                                <!--Thêm dropdown cho loại người dùng--> 
                                <div class="form-group">
                                    <label for="user_type">Choose User Type:</label>
                                    <select class="form-control" id="user_type" name="roles" required>
                                        <option value="1">Người Thuê</option>
                                        <option value="2">Người Cho Thuê</option>
                                    </select>
                                </div>
                                <!-- Thêm thông tin của người dùng -->
                                <div class="form-group">
                                    <label for="phone">Số điện thoại:</label>
                                    <input type="tel" class="form-control"  name="numphone" required>
                                </div>

                                <div class="form-group">
                                    <label for="DOB">Ngày sinh:</label>
                                    <input type="date" class="form-control"  name="ngaysinh" required>
                                </div>

                                <div class="form-group">
                                    <label for="CCCD">CCCD:</label>
                                    <input type="text" class="form-control"  name="cccd" required>
                                </div>

                                <div class="form-group">
                                    <label for="DOT">Ngày cấp cccd:</label>
                                    <input type="date" class="form-control"  name="dot" required>
                                </div>

                                <div class="form-group">
                                    <label for="WOT">Nơi cấp cccd:</label>
                                    <input type="text" class="form-control"  name="wot" required>
                                </div>

                                <button type="submit" class="btn btn-primary btn-block">Register</button>
                            </form>
                            <div class="login-form">
                                <p> Đã là thành viên?</p>
                                <a href="login.jsp" class="btn btn-success">Đăng nhập</a>
                                <p> tại đây</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Link to Bootstrap JS and jQuery (if needed) -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

        <script>
                                function validateForm() {
                                    var password = document.getElementById("password").value;
                                    var confirm_password = document.getElementById("confirm_password").value;
                                    var passwordMatchError = document.getElementById("passwordMatchError");

                                    if (password !== confirm_password) {
                                        passwordMatchError.classList.remove("d-none");
                                        return false; // Prevent form submission
                                    } else {
                                        passwordMatchError.classList.add("d-none");
                                        return true; // Allow form submission
                                    }
                                }
        </script>
    </body>
</html>