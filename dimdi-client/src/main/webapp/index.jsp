<!DOCTYPE html>
<html lang="en" ng-app="dimdi">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="favicon.ico">

    <title>DIMDI</title>

    <!-- Bootstrap core CSS -->
    <link href="dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="styles/custom.css" rel="stylesheet">
    
    <!-- AngularJS -->
    <script src="libs/angular-1.6.4/angular.min.js"></script>
    <script src="libs/angular-1.6.4/angular-ui-router.min.js"></script>
    <script src="dimdiapp/app.js"></script>
    
    <!-- Services -->
    <script src="dimdiapp/models/dimdimain.service.js"></script>
    
    <!-- Controllers -->
    <script src="dimdiapp/sites/home/home.controller.js"></script>
    <script src="dimdiapp/sites/view1/view1.controller.js"></script>
    <script src="dimdiapp/sites/view2/view2.controller.js"></script>
    <script src="dimdiapp/sites/view3/view3.controller.js"></script>
  </head>

  <body>

    <nav class="navbar navbar-toggleable-md navbar-inverse bg-inverse fixed-top">
      <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarsDIMDI" aria-controls="navbarsDIMDI" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <a class="navbar-brand" href="#">DIMDI</a>

      <div class="collapse navbar-collapse" id="navbarsDIMDI">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item">
            <a class="nav-link" ui-sref="home" ui-sref-active="active">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" ui-sref="view1" ui-sref-active="active">View 1</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" ui-sref="view2" ui-sref-active="active">View 2</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" ui-sref="view3" ui-sref-active="active">View 3</a>
          </li>
        </ul>
      </div>
    </nav>

    <div class="container dimdi-container">

      <ui-view></ui-view>

    </div><!-- /.container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
    <script src="dist/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
