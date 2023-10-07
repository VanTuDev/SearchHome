<!DOCTYPE html>
<html lang="vi">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="node_modules/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="style.css">
    <!-- link icon font -->
    <link rel="stylesheet" href="node_modules/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="node_modules/bootstrap-social/bootstrap-social.css">
    <link rel="shortcut icon" href="img/2x/logo@2x.png" type="image/x-icon">
    <title>Search House</title>
</head>

<body>
    <!-- jQuery first, then Popper.js, then Bootstrap JS. -->
    <!-- Script -->

    <!-- task-bar -->
    <div class="task-bar">
        <nav class="navbar navbar-dark navbar-expand-sm">
            <div id="loginModal" class="modal fade" role="dialog">
                <div class="modal-dialog modal-lg">
                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 class="modal-title">Login </h4>
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                        </div>
                        <div class="modal-body">
                            <form>
                                <div class="form-row">
                                    <div class="form-group col-sm-4">
                                        <label class="sr-only" for="exampleInputEmail3">Email or username</label>
                                        <input type="email" class="form-control form-control-sm mr-1"
                                            id="exampleInputEmail3" placeholder="Enter email">
                                    </div>
                                    <div class="form-group col-sm-4">
                                        <label class="sr-only" for="exampleInputPassword3">Password</label>
                                        <input type="password" class="form-control form-control-sm mr-1"
                                            id="exampleInputPassword3" placeholder="Password">
                                    </div>
                                    <div class="col-sm-auto">
                                        <div class="form-check">
                                            <input class="form-check-input" type="checkbox">
                                            <label class="form-check-label"> Remember me
                                            </label>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-row">
                                    <button type="button" class="btn btn-secondary btn-sm ml-auto"
                                        data-dismiss="modal">Cancel</button>
                                    <button type="submit" class="btn btn-primary btn-sm ml-1">Sign in</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <div id="registerModal" class="modal fade" role="dialog">
                <div class="modal-dialog modal-lg" >
                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 class="modal-title">Login </h4>
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                        </div>
                        <div class="modal-body">
                            <form>
                                <div class="form-row">
                                    <div class="form-group col-12">
                                        <label class="sr-only" for="exampleInputEmail3">Email or username</label>
                                        <input type="email" class="form-control form-control-sm mr-1"
                                            id="exampleInputEmail3" placeholder="Enter email">
                                    </div>
                                    <div class="form-group col-12">
                                        <label class="sr-only" for="exampleInputPassword3">Password</label>
                                        <input type="password" class="form-control form-control-sm mr-1"
                                            id="exampleInputPassword3" placeholder="Password">
                                    </div>
                                    <div class="form-group col-12">
                                        <label class="sr-only" for="exampleInputPassword3">Confirm password</label>
                                        <input type="password" class="form-control form-control-sm mr-1"
                                            id="exampleInputPassword3" placeholder="Confirm password">
                                    </div>
                                    <div class="form-group col-12">
                                        <label class="sr-only" for="exampleInputPhoneNumber">Phone Number</label>
                                        <input type="text" class="form-control form-control-sm mr-1"
                                            id="exampleInputPhoneNumber" placeholder="Phone Number">
                                    </div>
                                    <div class="form-group col-8">
                                        <label class="sr-only" for="exampleInputDOB">DOB</label>
                                        <input type="date" class="form-control form-control-sm mr-1"
                                            id="exampleInputDOB" >
                                    </div>
                                    <div class="form-group col-3">
                                        <label class="sr-only" for="exampleInputWho">Who</label>
                                        <select id="exampleInputWho" name="role">
                                            <option  disabled value="Who">B?n là ai?</option>
                                            <option value="nguoi-thue">Ng??i thuê</option>
                                            <option value="chu-cho-thue">Ch? cho thuê</option>
                                          </select>
                                    </div>
                                    <div class="form-group col-6">
                                        <label class="sr-only" for="exampleInputCCCD">CCCD</label>
                                        <input type="text" class="form-control form-control-sm mr-1"
                                            id="exampleInputCCCD" placeholder="CCCD">
                                    </div>
                                    <div class="form-group col-6">
                                        <label class="sr-only" for="exampleInputDOR">DOR</label>
                                        <input type="date" class="form-control form-control-sm mr-1"
                                            id="exampleInputDOR" placeholder="Ngày c?p th?">
                                    </div>
                                </div>
                                <div class="form-row">
                                    <button type="button" class="btn btn-secondary btn-sm ml-auto"
                                        data-dismiss="modal">Cancel</button>
                                    <button type="submit" class="btn btn-primary btn-sm ml-1">Register in</button>
                                </div>
                            </form>
                        </div>
                    </div>
                <!--</div>-->
            </div>
            <div class="container">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#Navbar">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <a class="navbar-brand mr-auto" href="#"><img src="img/2x/logo@2x.png"></a>
                <div class="collapse navbar-collapse" id="Navbar">
                    <ul class="navbar-nav mr-auto ">
                        <li class="nav-item active"><a class="nav-link" href="#"><span
                                    class="fa fa-building fa-lg"></span>
                                C?n h?</a></li>
                        <li class="nav-item"><a class="nav-link" href="#"><span class="fa fa-home fa-lg"></span> Phòng
                                tr?</a></li>
                    </ul>
                    <span class="navbar-text">
                        <a data-toggle="modal" data-target="#loginModal">
                            <span class="fa fa-sign-in"></span> Login</a>
                    </span>
                    <span class="navbar-text">
                        <a data-toggle="modal" data-target="#registerModal">
                            <span class="fa fa-sign-in"></span>Register</a>
                    </span>
                </div>
            </div>
        </nav>
    </div>

    <!-- Ph?n ??u -->
    <header class="head-container">
        <div class="container">
            <div class="row row-header">
                <div class="col-12 col-md-5" id="search-bar-container">
                    <i class="fa fa-search" aria-hidden="true"></i>
                    <input type="text" id="search-bar" placeholder="Nh?p t? khóa">
                </div>
                <div id="results"></div>

            </div>
        </div>
    </header>

    <!-- Ph?n thân -->

    <div class="content container">
        <div class="content-container">
            <div class="head-content">
                <img src="img/2x/c?n h?.jpeg" alt="C?n h?">
                <!-- <ol class="breadcrumb">
                    <li class="breadcrumb-item"><a href="./index.html">Home</a></li>
                    <li class="breadcrumb-item active">c?n</li>
                </ol> -->
                <h3>C?n h? cho thuê t?i Sunrise</h3>
            </div>
            <div class="content-body">
                <div class="content-row row">
                    <h5 class="col-3 col-md-2"><strong>15.000.000?</strong></h5>
                    <h5>&bull;</h5>
                    <h5 class="col-3 col-md-2"><strong>99 m&sup2</strong></h5>
                    <h5>&bull;</h5>
                    <h5 class="d-none d-sm-flex col-md-1 d-md-1">2<span class="fa fa-bed fa-lg col-md-6"></span></h5>
                    <h5 class="d-none d-sm-flex col-md-1">2<span class="fa fa-bath fa-lg col-md-6"></span></h5>
                    <h5>&bull;</h5>
                    <h5 class="col-auto col-md-auto">Qu?n 7, H? Chí Minh</h5>
                </div>
                <div>
                    <p>- Giá ngày .+ 1PN: 1.3tr/ngày. + 2PN: 1.8tr/ngày. + 3PN: 2.3tr/ngày. - Giá tháng. + C?n h? 1PN:
                        Giá 11tr/th (65m²). + C?n h? 2PN: Giá t? 15tr/th (76m², 99m², 106m²). + C?n h? 3PN: Giá 15tr -
                        20 tr/th (129m²,...)</p>
                </div>
            </div>
            <div class="row content-account">
                <div class="row col-6 account">
                    <img src="img/2x/pixelnexus-low-resolution-logo-white-on-black-background.png" alt="?nh ??i di?n">
                    <h6><strong>Lee Hieu</strong><br>??ng 6' tr??c</h6>
                </div>
                <div class="row col-6 phone">
                    <div class="number-phone">
                        <h5>091********</h5>
                    </div>
                    <i class="col-1 heart fa fa-heart-o fa-2x"></i>
                </div>
            </div>
        </div>
    </div>
    <!-- Ph?n ?uôi -->
    <footer class="footer">
        <div class="container">
            <div class="row">
                <div class="col-7 col-sm-6">
                    <h5>Our Address</h5>
                    <address>
                        FPT Urban Area<br>
                        Hoa Hai Ward<br>
                        Ngu Hanh Son District<br>
                        Da Nang City<br>
                        VietNam <br>
                        <i class="fa fa-phone fa-lg"></i>: +84 919280763<br>
                        <i class="fa fa-fax fa-lg"></i>: +84 919280763<br>
                        <i class="fa fa-envelope fa-lg"></i>:
                        <a href="mailto:confusion@food.net">shteam@service.com</a>
                    </address>
                </div>
                <div class="col-12 col-sm-6 align-self-center">
                    <div class="text-right">
                        <h5><strong>Contact us with</strong></h5>
                    </div>
                    <div class="text-right">
                        <a class="btn btn-social-icon btn-google" href="http://google.com/+"><i
                                class="fa fa-google-plus"></i></a>
                        <a class="btn btn-social-icon btn-facebook" href="http://www.facebook.com/profile.php?id="><i
                                class="fa fa-facebook"></i></a>
                        <a class="btn btn-social-icon btn-linkedin" href="http://www.linkedin.com/in/"><i
                                class="fa fa-linkedin"></i></a>
                        <a class="btn btn-social-icon btn-twitter" href="http://twitter.com/"><i
                                class="fa fa-twitter"></i></a>
                        <a class="btn btn-social-icon btn-google" href="http://youtube.com/"><i
                                class="fa fa-youtube"></i></a>
                        <a class="btn btn-social-icon" href="mailto:"><i class="fa fa-envelope-o"></i></a>
                    </div>
                </div>
            </div>
        </div>
    </footer>
</body>

</html>